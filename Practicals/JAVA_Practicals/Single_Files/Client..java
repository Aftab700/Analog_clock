import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void  main(String[] args)
    {
        try {
            Socket s = new Socket("localhost", 6677);
            DataInputStream din=new DataInputStream(s.getInputStream());
            String a=(String)din.readUTF();
            System.out.println(a);
            din.close();
            s.close();
        }
        catch (Exception e)
        {

        }
    }

}
