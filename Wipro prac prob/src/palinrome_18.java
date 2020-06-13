
public class palinrome_18 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int temp=n;
	int cur=0,rem;
	while(temp!=0) {
		rem=temp%10;
		cur=cur*10+rem;
		temp=temp/10;
	}
	if(n==cur)
		System.out.println(n+" is a palindrome");
	else
		System.out.println(n+" is not a palindrome");
}
}
