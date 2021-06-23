package project12;

import java.util.HashMap;


public class Maain {
	public static void main(String[] args) {
		int nums[] = new int[] {9,6,4,2,3,5,7,0,1};
		int n = nums.length;
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; ++i) {
			if(!hmp.containsKey(nums[i])) {
				hmp.put(nums[i], 1);
				
			}
			
		}
		int ans = -1;
		for(int i = 0; i < n; i++) {
			if(!hmp.containsKey(i)) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
		
	}
	
 
}
 