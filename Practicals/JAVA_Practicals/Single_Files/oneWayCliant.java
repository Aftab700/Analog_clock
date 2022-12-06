// Cliant to server one way communication 
import java.io.*;  
import java.net.*;  
// class MyClient {  
// public static void main(String[] args) {  
// try{      
// Socket s=new Socket("localhost",6666);  
// DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
// dout.writeUTF("Hello Server");  
// dout.flush();  
// dout.close();  
// s.close();  
// }catch(Exception e){System.out.println(e);}  
// }  
// }  

//server to cliant one way communication 
class Client   
{
  public static void main(String args[]) throws Exception    
  {
    Socket sock = new Socket("127.0.0.1", 7000);  

    InputStream istream = sock.getInputStream();
    BufferedReader br1 = new BufferedReader(new InputStreamReader(istream));

    String s1 = br1.readLine();
    System.out.println(s1);

    br1.close();    istream.close();   sock.close( );
  }
}