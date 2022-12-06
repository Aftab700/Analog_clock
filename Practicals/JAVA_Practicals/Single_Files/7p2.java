import java.io.*;
public class p2 {
    public static void main(String[] args) {
             File in=new File("D:\\html\\New\\1.jpg");
            File out=new File("D:\\html\\New\\2.jpg");
            
              try{
                FileInputStream fin=new FileInputStream(in);
                FileOutputStream fout=new FileOutputStream(out);
                BufferedInputStream bin=new BufferedInputStream(fin);
                 BufferedOutputStream bout=new BufferedOutputStream(fout);
             byte[] b=new byte[1024];
             int l;
             while ((l=bin.read(b))!=-1) {
                bout.write(b,0,l);
                 
             }
             try{fin.close();
                fout.close();
                bin.close();
                bout.close();
                }catch(IOException e){}
                
            
             
             System.out.println("copied 1.jpg to 2.jpg using Bufferd Input/Output Sream");
            }catch(IOException e){ e.printStackTrace();}
            
                
               
            
        

        
    }
    
}
