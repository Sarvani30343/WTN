
public class alphaswapcase7 {
public static void main(String[] args) {
	String s = args[0];
	char c =s.charAt(0);
	int temp;
	if(c>'a' && c<='z') {
		System.out.println(c+"->");
		temp=(int)c;
		c=(char)(temp-32);
		System.out.println(c);
	}
	else {
		System.out.println(c+"->");
		temp=(int)c;
		c=(char)(temp+32);
		System.out.println(c);
	}
}
}
