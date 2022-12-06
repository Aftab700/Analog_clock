import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class chclient2{
    public static void  main(String[] args)
    {
        try {
            Socket s = new Socket("localhost", 6677);


            String str1="";
            String str2="";


            se t1=new se(s);
            re t2=new re(s);
            t1.start();t2.start();






        }
        catch (Exception e)
        {

        }
    }

}
class se extends Thread{
    Socket s;
    String str2="";
    public se(Socket s)
    {
        this.s=s;
    }
    public void run()
    {
        try{
            while(!str2.equals("byy")) {
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
class re extends Thread
{
    Socket s;
    String str1="";
    public re(Socket s)
    {
        this.s=s;
    }
    public  void run()
    {
        try {
            while (!str1.equals("byy")) {
                DataInputStream din = new DataInputStream(s.getInputStream());
                str1 = din.readUTF();
                System.out.println("server say:" + str1);
            }
        }
        catch (Exception e)
        {

        }

    }
}
