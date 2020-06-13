
public class sumndavg_arrays1 {
public static void main(String[] args) {
	 int n=5, sum = 0;
     float average;
     
     int a[] = {1,3,5,7,9};
     
     for(int i = 0; i < n ; i++)
     {
        
         sum = sum + a[i];
     }
     System.out.println("Sum:"+sum);
     average = (float)sum / n;
     System.out.println("Average:"+average);
}
}
