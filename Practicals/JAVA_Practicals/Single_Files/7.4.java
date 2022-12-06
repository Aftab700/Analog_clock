import java.util.*;
import java.io.*;
public class p744{
    public static void main(String[] args) {
        Properties p=new Properties();
        Map<String,String> hm=new HashMap<String,String>();
        hm.put("@aftab", "Aa1");
        hm.put("@aftab1", "Aa12");
        hm.put("@aftab2", "Aa123");
        hm.put("@aftab3", "Aa1234");
        for(Map.Entry<String, String> me : hm.entrySet())
        {
            p.setProperty(me.getKey(), me.getValue());
            //   System.out.println(me.getKey()+":"+me.getValue());
        }
        try{

            p.store(new FileWriter("D:/html/p.txt"), "usernames and passwords");
        }catch(Exception e){}
        System.out.println("username : value");

        // System.out.println(p.toString());
        Set set=p.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        // for(Map.Entry<String, String> me : hm.entrySet())
        // {
        //     //   System.out.println(hm);
        //       System.out.println(me.getKey()+":"+me.getValue());
        // }
    }
}
