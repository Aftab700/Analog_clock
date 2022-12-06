import java.io.*;
import java.util.*;

import javax.swing.ListModel;

import java.nio.CharBuffer;
public class p74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        int i;
        List<String> a=new ArrayList<>();
        System.out.println("add to list=");
        n=sc.nextLine();
        a.add(n);
        System.out.println(a);
        System.out.println("add to list=");
        n=sc.nextLine();
        a.add(n);
        System.out.println(a);
        System.out.println("add to list=");
        n=sc.nextLine();
        a.add(n);
        System.out.println(a);
        System.out.println("add to list=");
        n=sc.nextLine();
        a.add(n);
        System.out.println(a);
        System.out.println("remove from list=");
        n=sc.nextLine();
        a.remove(n);
        System.out.println(a);
        
         System.out.println("iterator = ");
         Iterator<String> ai=a.iterator();
         while (ai.hasNext()) {
             System.out.println(ai.next()+" ");
         }
         System.out.println(a);
         System.out.println("update place=");
         i=sc.nextInt();
         System.out.println("update valu=");
         n=sc.nextLine();
         n=sc.nextLine();
         a.set(i,n);
        System.out.println(a);
        System.out.println("search list=");
        n=sc.nextLine();
        if(a.contains(n)){
        System.out.println("Index="+a.indexOf(n));}
        else{System.out.println("Not Found");}
        System.out.println(a);
        System.out.println("sort list=");
        Collections.sort(a);
        System.out.println(a);
         
        List<String> a1=new ArrayList<>();
      //  a1.add("copy");
        a1.add("copy1");
        a1.add("copy2");
        //a1.add("copy4");
        a1.add("copy3");
       // a1.add("copy2");
        //a1.add("copy3");
        System.out.println("list 2 =");
        System.out.println(a1);
        Collections.copy(a1,a);
        System.out.println("list 2 after copy =");
        System.out.println(a1);

    }
    
}
