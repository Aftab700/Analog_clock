//package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void  main(String[] args)


    {
        try{
            ServerSocket ss=new ServerSocket(6677);
            Socket s=ss.accept();
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("welcome client");
            dout.flush();
            dout.close();
            s.close();
            ss.close();
        }
        catch (Exception e)
        {

        }
    }

}
