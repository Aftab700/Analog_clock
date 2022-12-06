import java.util.*;
import java.io.*;
public class p766 {
    public static void main(String[] args) {
          Hashtable<String,String> ht=new Hashtable<String,String>();
        Properties p=new Properties();
         ht.put("book1", "The Curse of Black Pearl");
         ht.put("book2", "Dead Man's Chest");
         ht.put("book3", "At World's End");
         ht.put("book4", "On Stranger Tides");
         ht.put("book5", "Salazar's Revenge");
         for(Map.Entry<String, String> me : ht.entrySet())
         {
             p.setProperty(me.getKey(), me.getValue());
             //   System.out.println(me.getKey()+":"+me.getValue());
         }
         try{
 
             p.store(new FileWriter("D:/html/library.txt"), "library");
         }catch(Exception e){}
         System.out.println("hash Table=");
        // for(Map.Entry<String, String> me : ht.entrySet())
        // {
        //       System.out.println(me.getKey()+":"+me.getValue());
        // }  
        Set set=p.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
