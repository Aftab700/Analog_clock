import java.io.*;
 
class cp2{
    public static String rr(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return rr(input.substring(1));
        else
            return input.charAt(0) + rr(input.substring(1));
    }
    public static void main(String[] args)
    {
        String S1 = "aafftabb";
        System.out.println(rr(S1));
   
        String S2 = "ssamma";
        System.out.println(rr(S2));
    }
}
