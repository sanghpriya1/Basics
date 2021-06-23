/**
 * 
 */
package project12;

/**
 * @author Sanghpriya
 *
 */
public class MergeK {
	public static void main(String args[]) {
		int[][] input = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
		int k = input[0].length-1;
		int[] arr = new int[12];
		for(int i = 0; i < k+1; i++) {
			arr[i] = input[0][i];
		}
	
		for(int i = 1; i< 3; i++) {
			int n = input[i].length;
			int l = k;
			k += n;
			int kk = k;
			--n;
			while( k >= 0 && n >=0 && l >=0) {
				if(input[i][n] > arr[l]) {
					arr[k] = input[i][n];
					n--;
					k--;
				}
				else {
					arr[k] = arr[l];
					l--;
					k--;
				}
			}
			while(n >= 0 && k >=0) {
				arr[k] = input[i][n];
				n--;
				k--;
			}
			k = kk;
		}
		for(int i = 0; i < arr.length; ++i) {
		System.out.println(arr[i]);
		
		}
	}
}
