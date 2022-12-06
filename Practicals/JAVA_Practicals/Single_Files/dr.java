import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class dr {
    public static void  main(String[] args)
    {
        try{
            DatagramSocket ds=new DatagramSocket(6677);
            byte[] buf=new byte[512];
            DatagramPacket dp=new DatagramPacket(buf,512);
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
            ds.close();

        }
        catch (Exception e)
        {

        }

    }
}
