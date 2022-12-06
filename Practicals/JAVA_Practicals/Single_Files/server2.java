import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
    public static void  main(String[] args)


    {
        try{
            ServerSocket ss=new ServerSocket(6677);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str1="";
            String str2="";
            while (!str1.equals("byy")) {
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
                str1=din.readUTF();
                System.out.println("client say:"+str1);
            }
            dout.close();
            s.close();
            ss.close();
            din.close();
        }
        catch (Exception e)
        {

        }
    }

}
