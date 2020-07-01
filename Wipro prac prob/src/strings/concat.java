package strings;
import java.util.*;
public class concat 
{
public String conCat(String st1, String st2) 
{
        String s=" ";
        String s1 = st1.substring(0,st1.length()).toLowerCase();
        String s2 = st2.substring(0,st2.length()).toLowerCase();
       
        return s1+s+s2;
}

    public static void main (String[] args)
    {
      concat m= new concat();
      String str1 =  "Sachin";
      String str2 = "Tendulkhar";
     
      System.out.println("The given strings are: "+str1+"  and  "+str2);
      System.out.println("The string after concatination are: "+m.conCat(str1,str2));
    }
}
