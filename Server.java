
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
public class Server extends JFrame{
	
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	//constructor
	public Server(){
		super("Aman's messenger");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
			);
		    add(userText, BorderLayout.NORTH);
		    chatWindow = new JTextArea();
		    add(new JScrollPane(chatWindow));
		    setSize(300,150);
		    setVisible(true);
	}  
  
	//set up and run server
	public void startRunning(){
		try{
			server = new ServerSocket(6789 , 100);
			while(true){
				try{
					waitForConnection();
					setupStreams();
					whileChatting();
				}catch(EOFException eofException){
					showMessage("\n Aman ended the connection!! ");
				}finally{
					closeCrap();
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	//wait for connection and then display connection information
	private void waitForConnection() throws IOException{
		showMessage(" Waiting for someone to connect.. \n");
		connection = server.accept();
		showMessage( " Now connected to " + connection.getInetAddress().getHostName());
	}
	
	//get stream to send and receive data
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setup! \n");
	}
	
	//during chat convo..
	private void whileChatting() throws IOException{
		String message = " You are now connected! ";
		sendMessage(message);
		ableToType(true);
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n Aman sent invalid data!");
			}
		}while(!message.equals("CLIENT - END"));
	}
	
	//Close Streams and Sockets
	private void closeCrap(){
		showMessage("\n Closing connections.... \n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	//Send message
	private void sendMessage(String message){
		try{
			output.writeObject("AMAN - " + message);
			output.flush();
			showMessage("\n AMAN - " + message);
		}catch(IOException ioException){
			chatWindow.append("\n ERROR: This message cannot be sent");
		}
	}
	
	//Updates chatWindow
	private void showMessage(final String text){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.append(text);
					}
				}
			);
	}
	
	//Let the user to type
	private void ableToType(final boolean tof){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						userText.setEditable(tof);
					}
				}
			);
	}
}


	
	
	
				
