package project12;



public class Alternate {
	 private static void swap(int x, int y){
	       
	        x = x * y;
	        y = x/y;
	        x = x/y;
	      
	    }
	public static void main(String[] args) {
	int[] nums = new int[] {1,2,3};
		 int n = nums.length;
	       // int ans = 0;
	        if(n==1)return;
	        int min = n-1;
	        for(int i = n-1; i >= 0; i--){
	            if(nums[i] < nums[min]){
	                swap(nums[i], nums[min]);
	             //   ans=1;
	                break;
	            }
	        }
	        
	        System.out.println(1);
	}

}
