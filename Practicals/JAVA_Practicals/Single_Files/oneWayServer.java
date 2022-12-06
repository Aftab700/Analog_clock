// Cliant to server one way communication 
import java.io.*;  
import java.net.*;  
// class MyServer{  
// public static void main(String[] args){  
// try{  
// ServerSocket ss=new ServerSocket(6666);  
// Socket s=ss.accept();//establishes connection   
// DataInputStream dis=new DataInputStream(s.getInputStream());  
// String  str=(String)dis.readUTF();  
// System.out.println("Cliant: "+str);  
// ss.close();  
// }catch(Exception e){System.out.println(e);}  
//   }  
// }  

//server to cliant one way communication 
class DateInfoServer   
{
  public static void main(String args[]) throws Exception   
  {
    ServerSocket sersock = new ServerSocket(7000); 
    System.out.println("Server ready........");  
    Socket sock = sersock.accept( );
 	                          
    OutputStream ostream = sock.getOutputStream();                  
    BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(ostream));
    String s2 = "Your are welcome here client  " + new java.util.Date();
    bw1.write(s2);                      

    bw1.close();    ostream.close();   sock.close();   sersock.close( );
  }
}