import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyStore;

public class chserver2 {
    public static void  main(String[] args)


    {
        int i;
        try{
            ServerSocket ss=new ServerSocket(6677);
            Socket s=ss.accept();
            send t1=new send(s);
            receive t2=new receive(s);

           t1.start();t2.start();
        }
        catch (Exception e)
        {

        }
    }

}
class send  extends Thread{
    Socket s;
    String str2="";
    public send(Socket s)
    {
        this.s=s;
    }
    public void run()
    {
        try{
            while (!str2.equals("byy")) {
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
        }
        catch (Exception e)
        {

        }

    }
}
class receive extends Thread
{
    Socket s;
    String str1="";
    public receive(Socket s)
    {
        this.s=s;
    }
    public  void run()
    {
        try {
            while (!str1.equals("byy")) {
                DataInputStream din = new DataInputStream(s.getInputStream());
                str1 = din.readUTF();
                System.out.println("client say:" + str1);
            }
        }
        catch (Exception e)
        {

        }

    }
}

