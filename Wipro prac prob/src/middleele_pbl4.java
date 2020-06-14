import java.util.Arrays; 
public class middleele_pbl4 {
	public static int[] middleWay(int[] a, int[] b) {
		  int[] array = new int[2];
		  array[0] = a[a.length / 2];
		  array[1] = b[b.length / 2];
		  return array;
		}
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		System.out.println(middleWay(a,b));
	}
}
