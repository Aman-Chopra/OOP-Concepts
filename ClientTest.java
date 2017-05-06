import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args){
		Client Aman;
		Aman = new Client("127.0.0.1");
		Aman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Aman.startRunning();
	}
}
