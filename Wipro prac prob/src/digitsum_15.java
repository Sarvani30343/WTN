
public class digitsum_15 {
public static void main(String[] args) {
	 int n, sum = 0;
	 int m=Integer.parseInt(args[0]);
     while(m > 0)
     {
         n = m % 10;
         sum = sum + n;
         m = m / 10;
     }
     System.out.println(sum);
}
}
