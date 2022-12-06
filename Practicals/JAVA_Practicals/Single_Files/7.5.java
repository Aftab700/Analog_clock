import java.util.*;

public class p755 {
    public static void main(String[] args) {
        
        Map<String,String> hm=new HashMap<String,String>();
        hm.put("@aftab", "Aa1");
        hm.put("@aftab1", "Aa12");
        hm.put("@aftab2", "Aa123");
        hm.put("@aftab3", "Aa1234");
        System.out.println("Map=");
        for(Map.Entry<String, String> me : hm.entrySet())
        {
            //   System.out.println(hm);
              System.out.println(me.getKey()+":"+me.getValue());
        }
        hm.put("@aftab1", "changed");
        hm.remove("@aftab3");
        System.out.println("Map after removing @aftab3 and changing @aftab1 = ");
        for(Map.Entry<String, String> me : hm.entrySet())
        {
            //   System.out.println(hm);
              System.out.println(me.getKey()+":"+me.getValue());
        }
    }
}
