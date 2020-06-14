
public class oneor4_arrpbl3 {
	public boolean only14(int[] nums) {

		  boolean flag = false;

		  for (int i = 0; i < nums.length; i++) {

		    if (nums[i] == 1 || nums[i] == 4) {
		      flag = true;
		    } else {
		      return false;
		    }
		  }
		  return flag;
		}
public static void main(String[] args) {
	int arr[]= {1,4,1,4};
	System.out.println("Array: "
            + only14(nums)); 
}
}
