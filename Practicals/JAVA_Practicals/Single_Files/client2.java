import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class client2 {
    public static void  main(String[] args)
    {
        try {
            Socket s = new Socket("localhost", 6677);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str1="";
            String str2="";
            while (!str1.equals("byy")) {
                str1=din.readUTF();
                System.out.println("server say:"+str1);
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            dout.close();
            s.close();
            din.close();


        }
        catch (Exception e)
        {

        }
    }

}
