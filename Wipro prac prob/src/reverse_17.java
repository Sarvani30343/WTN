
public class reverse_17 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int rem;
	while(n!=0) {
		rem=n%10;
		System.out.print(rem);
		n=n/10;
	}
}
}
