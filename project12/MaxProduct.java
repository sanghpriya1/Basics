/**
 * 
 */
package project12;

/**
 * @author Sanghpriya
 *
 */
class Answer{
	public static int solve(int[] arr, int x) {
		int[] product = new int[x];
		int[] zero = new int[x];
		int[] minusIndex = new int[x];
		int[] lastMinus = new int[x];
		product[0] = 1;
		for(int i = 1; i < x; i++) {
			if(arr[i] == 0) {
				product[i] = product[i-1];
			}
			else
			product[i] = Math.abs(arr[i]) * product[i-1];
			
		}
		zero[0] = -1;
		for(int i = 1; i < x; i++) {
			if(arr[i] == 0) {
				zero[i] = i;
			}
			else {
				zero[i] = zero[i -1];
			}
		}
		minusIndex[0] = -1;
		for(int i = 1; i < x; i++) {
			if(arr[i] < 0) {
				minusIndex[i] = i;
				
			}
			else {
				minusIndex[i] = minusIndex[i-1];
			}
		}
		int[] right = new int[x+1];
		right[x+1] = Integer.MIN_VALUE;
		for(int i = x; i > 0; i--) {
			if(arr[x] < 0) {
				right[x] = i;
			}
			else {
				right[x] = right[x+1];
			}
		}
		int[] leftMinus = new int[x];
		leftMinus[0] = 0; 
		int count = 0;
		for(int i = 1; i < x; i++) {
			if(arr[i] < 0) {
				leftMinus[i] = ++count;
			}
			else {
				leftMinus[i] = leftMinus[i-1];
			}
		}
		int maxl = arr[0];
		int[] finalProduct = new int[x];
		for(int i = 1; i < x; i++) {
			if(arr[i] < 0 ) {
				int x = IndexOfLeftZero[i];
				if(x > -1) {
				int startindex = x + 1;
				if(startIndex == i)
					finalProduct[i] = 0;
				else {
					
				}
					
			}
			}
			else {
				int x = IndexOfLeftZero[i];
				if(x > -1) {
					int startindex = x + 1;
					if()
					
				}
			}
			
		}
		
		
		
		
	}
	
	
}
public class MaxProduct {
	int[] x = {1, 1, 4, -1, 5, -1};
	
  
}
