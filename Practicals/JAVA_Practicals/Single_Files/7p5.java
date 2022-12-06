import java.util.*;

public class p75 {
public static void main(String[] args) {
    String s;
    List<String> a=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("add to List=");
    s=sc.nextLine();
    a.add(s);
    System.out.println("add to List=");
    s=sc.nextLine();
    a.add(s);
    System.out.println("add to List=");
    s=sc.nextLine();
    a.add(s);
    System.out.println("add to List=");
    s=sc.nextLine();
    a.add(s);
    System.out.println("add to List=");
    s=sc.nextLine();
    a.add(s);
    System.out.println("List= "+a);
    System.out.println("Sub List from 2 to 4= "+a.subList(2, 4));
    Collections.reverse(a);
    System.out.println("Reverse List = "+a);
    
    String aa[]=new String[a.size()];
    aa=a.toArray(aa);
    System.out.println("elements of array="+Arrays.toString(aa));
    Collections.shuffle(a);
    System.out.println("List after shuffle= "+a);
    

}    
}
