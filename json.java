
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;


public class json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here 
        Scanner s= new Scanner(System.in);
        String st=s.nextLine();
        System.out.println(st);
            st=st.replace(" ","+");
            
        checkConcept(st);
        checkSentiment(st);
        
          
    }
    
    
        public static void checkSentiment(String x) throws Exception
    {
        try{
            System.out.println(x);
            x=x.replace(" ","+");
            System.out.println(x);
  URL url = new URL("https://api.havenondemand.com/1/api/sync/analyzesentiment/v1?text="+x+"&apikey=0b829572-b49e-4531-8ce3-bc902904aaf0");
  URLConnection spoof = url.openConnection();
 
  //Spoof the connection so we look like a web browser
  spoof.setRequestProperty( "User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0; H010818)" );
  BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));
  String strLine = "";
  StringBuilder n=new  StringBuilder();
  //Loop through every line in the source
  while ((strLine = in.readLine()) != null){
 
   n.append(strLine);
   
  }
  String res=n.toString();
  JSONObject jsonObj = new JSONObject(res);
  
            JSONObject jsonObjagg = jsonObj.getJSONObject("aggregate");
            
            String sent = jsonObjagg.getString("sentiment");
            Double sco = jsonObjagg.getDouble("score");
          
          System.out.println(sent+ " "+sco);
        }
        catch(Exception ex)
        {
            
    }
    }
        public static void checkConcept(String x) throws Exception
    {
        try{
            
  URL url = new URL("https://api.havenondemand.com/1/api/sync/extractconcepts/v1?text="+x+"&apikey=2d1823fb-4c61-4e24-98f3-bd9e01a9aace");
  URLConnection spoof = url.openConnection();
 
  //Spoof the connection so we look like a web browser
  spoof.setRequestProperty( "User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0; H010818)" );
  BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));
  String strLine = "";
  StringBuilder n=new  StringBuilder();
  //Loop through every line in the source
  while ((strLine = in.readLine()) != null){
 
   n.append(strLine);
   
  }
  String res=n.toString();
  JSONObject jsonObj = new JSONObject(res);
          JSONArray sportsArray = jsonObj.getJSONArray("concepts");
          int l=sportsArray.length();
          for(int i=0;i<l;i++){
          JSONObject firstSport = sportsArray.getJSONObject(i);
          String name = firstSport.getString("concept");
          int d=firstSport.getInt("occurrences");
          System.out.println(name + " "+d);}
        }
        catch(Exception ex)
        {
            
    }
    }
        
    
}
