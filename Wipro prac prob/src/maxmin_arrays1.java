
public class maxmin_arrays1 {
public static void main(String[] args) {
	int n=4;
	int a[]= {5,6,1,3};
	int max=a[0];		
	int min=a[0];
	for(int i:a) {
		if(i>max)
			max=i;
		else if(i<min)
			min=i;
	}	
	System.out.println("max"+max);
	System.out.println("min"+min);
	
}
}
