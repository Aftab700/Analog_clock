import java.net.*;
import java.io.*;                        // for IOException

class Receiver
{
  public static void main(String args[ ] ) throws SocketException, IOException
  {
    DatagramSocket dsock = new DatagramSocket(2000);            
    DatagramPacket dpack;
      byte arr1[] = new byte[100];
      dpack = new DatagramPacket(arr1, arr1.length);
      dsock.receive(dpack);                                                           
      byte arr2[] = dpack.getData();             
      String str = new String(arr2);    
      System.out.println(str);                      
    dsock.close();				
  }          
}