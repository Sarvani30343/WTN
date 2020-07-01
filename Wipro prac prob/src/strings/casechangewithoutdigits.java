package strings;
import java.util.*;
import java.lang.*;
import java.io.*;

class casechangewithoutdigits
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
    StringBuilder s = new StringBuilder("Hi999Hello wElcome");
    for(int i =0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            s.delete(i,i+1);
            i -=1;
        }
        else if(Character.isUpperCase(s.charAt(i)))
        {
            s.replace(i,i+1,(s.charAt(i)+"").toLowerCase());
        }
        else{
            s.replace(i,i+1,(s.charAt(i)+"").toUpperCase());
        }
    }
    System.out.println(s);
  }
}