package strings;

import java.util.*; 

class middlestring { 
    static String FirstAndLast(String str) 
    { 

        String[] arrOfStr = str.split(" "); 
 
        String res = ""; 

        for (String a : arrOfStr) { 
            res += a.substring(1, a.length() - 1) + " "; 
        } 
  
        return res; 
    } 
 
    public static void main(String args[]) 
    { 
        String str = "suman"; 
        System.out.println(str); 
        System.out.println(FirstAndLast(str)); 
    } 
} 