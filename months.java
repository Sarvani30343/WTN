package collections;

import java.util.*;  
class months{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Jan");
      alist.add("Feb");
      alist.add("Mar");
      alist.add("Apr");
      alist.add("May");
      alist.add("Jun");
      alist.add("Jul"); 
      alist.add("Aug");
      alist.add("Sep");
      alist.add("Oct");
      alist.add("Nov");
      
  
     
      System.out.println(alist);
  
      
      alist.add(11, "Dec");
  
      
      System.out.println(alist);
   }  
}