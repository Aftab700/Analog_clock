import java.io.*;
import java.util.*;
import java.nio.CharBuffer;
import java.util.Arrays;
public class p3 {
    public static void main(String[] args) {
        int i,j=0;
        char []a=new char[30];
        try{
        FileReader fr=new FileReader("D:/html/t.txt");
        FileWriter fw= new FileWriter("D:/html/o.txt");
        while((i=fr.read())!=-1){

            a[j]=(char)i;
            j++;
        }
          Arrays.sort(a);
          fw.write(a);
          //System.out.println("a=%s"+Arrays.toString(a));
          System.out.println("sorting done t.txt to o.txt");
        fr.close();
        fw.close();
        }catch(Exception e){}
    }
    
}
