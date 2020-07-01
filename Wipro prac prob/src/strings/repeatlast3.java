package strings;

public class repeatlast3 {
	public String repeatEnd(String str, int n) {
		  int len = str.length();
		  String newWord = "";
		  
		  for (int i = 0; i < n; i++) {
		    newWord += str.substring(len - n, len);
		  }
		  return newWord;
		}

    public static void main(String[] args) {
     repeatlast3 l=new repeatlast3();
        String c=l.repeatEnd("wipro",3);
        
        System.out.println(c);

    }

}
