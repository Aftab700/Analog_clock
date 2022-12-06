import java.net.*;     
class Sender
{
  public static void main(String args[]) throws Exception   
  {
    DatagramSocket dsock = new DatagramSocket();     
    InetAddress address = InetAddress.getLocalHost( ); 
    System.out.println("Server is ready");
     String s1 = "hello cliant ";
     byte arr[] = s1.getBytes( );
     DatagramPacket dpack = new DatagramPacket(arr, arr.length, address, 2000);
     dsock.send(dpack);                                             
    dsock.close();
  }
}