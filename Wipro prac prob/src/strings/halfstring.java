package strings;
import java.util.Scanner;
public class halfstring {
	

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc= new Scanner(System.in);
	        String abc= sc.nextLine();
	       
	        String bcd=null;
	        int lenght=abc.length();
	        int n=lenght/2;
	        if(lenght%2==0)
	        { bcd="";
	            for(int i=0;i<n;i++){
	                bcd=bcd+abc.charAt(i);
	               
	            }
	            System.out.print(bcd);
	        }
	        else
	        System.out.println(bcd);
	        sc.close();
	    }

	}


