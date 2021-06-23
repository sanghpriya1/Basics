/**
 * 
 */
package project12;

/**
 * @author Sanghpriya
 *
 */
class Solution1 {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int size = arr[n-1];
        int[] ans =  new int[size+1];
        for(int i = 0; i < n; i++){
            ans[arr[i]] = 1; 
        }
        int j;
        for(j = 1; j < ans.length; j++){
            if(ans[j] ==1);
            else{
                if(--k == 0)
                    
                break;
            }
            
        }
        return j;
    }
}
public class Missing {
	public static void main(String args[]) {
		int[] arr = {2, 3, 4, 7, 11};
		Solution1 sol1 = new Solution1();
		System.out.println(sol1.findKthPositive(arr, 5));
		
	}
}
