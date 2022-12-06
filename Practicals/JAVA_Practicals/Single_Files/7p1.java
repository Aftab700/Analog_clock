import java.io.*;
class p71{
    public static void main(String[] args) {
        try{
        File in=new File("D:\\html\\New\\1.jpg");
        File out=new File("D:\\html\\New\\2.jpg");
        FileInputStream fin=new FileInputStream(in);
         FileOutputStream fout=new FileOutputStream(out);
         byte[] b=new byte[1024];
         int l;
         while ((l=fin.read(b))>0) {
            fout.write(b,0,l);
             
         }
         fin.close();
         fout.close();
         System.out.println("copied 1.jpg to 2.jpg");
        }catch(IOException e){ e.printStackTrace();}

    }
}