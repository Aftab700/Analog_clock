import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class dse {
    public static void  main(String[] args)
    {
        try {
            DatagramSocket ds = new DatagramSocket();
            String s="Communication using UDP";
            DatagramPacket dp=new DatagramPacket(s.getBytes(StandardCharsets.UTF_8),s.length(),InetAddress.getByName("localhost"),6677);
            ds.send(dp);
            ds.close();
        }
        catch (Exception e)
        {

        }
    }
}
