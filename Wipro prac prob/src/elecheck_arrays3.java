
public class elecheck_arrays3 {
public static int main(String[] args) {
	int a[]= {8,15,62,87,35};
	
	int target=Integer.parseInt(args[0]);
		for (int i = 0; i < a.length; i++)
			if (a[i] == target)
				return i;
		
	
		return -1;
		
}
}
