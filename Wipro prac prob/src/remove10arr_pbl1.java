
public class remove10arr_pbl1 {

	public static 
	int[] removeTen(int[] nums) {
	    int i = 0;
	    
	    while(i < nums.length && nums[i] != 10)
	        i++;
	              
	    for(int j = i + 1; j < nums.length; j++) {
	        if(nums[j] != 10) {
	            nums[i] = nums[j];
	            nums[j] = 10;
	            i++;
	        }
	    }
	                                              
	    for( ; i < nums.length; i++)
	        nums[i] = 0;
	                                                      
	    return nums;
	}
	public static void main(String[] args) {
		int[] nums = {1, 10, 10, 2};
		int[] result = removeTen(nums);
		for(int i = 0; i < result.length; i++)
		System.out.print(result[i] + " ");
}
}
