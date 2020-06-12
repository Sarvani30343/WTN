
public class check_alp_dig_spechar5 {
public static void main(String[] args) {
	String s = args[0];
	char input_char =s.charAt(0);
	if ((input_char >= 65 && input_char <= 90) 
            || (input_char >= 97 && input_char <= 122)) 
            System.out.println(" Alphabet "); 
  
        else if (input_char >= 48 && input_char <= 57) 
            System.out.println(" Digit "); 
  
        else
            System.out.println(" Special Character "); 
}
}
