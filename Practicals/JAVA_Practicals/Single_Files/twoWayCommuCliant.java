import java.net.*;  
import java.io.*;  
class MyClient{  
public static void main(String args[])throws Exception{  
    try{
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("bey")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server: "+str2);  
}  
  
dout.close();  
s.close();  
}catch(Exception e){}
}}  