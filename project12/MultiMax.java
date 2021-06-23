package project12;

import java.util.Iterator;

public class MultiMax {
	public static void main(String[] args) {
		int[] arr = new int[] {-5,-3,-3,-2,7,1};
		int[] aws = new int[] {-10,-5,3,4,6};
		int m = arr.length;
		int n = aws.length;
		int i = 0;
		int j = m-1;
		int ans = 0;
		for(int k = 0; k < n; k++) {
			if(aws[k] < 0) {
				if(arr[i] <= arr[j]) {
					ans += aws[k]*arr[i];
					i++;
				}
				else {
					ans += aws[k]*arr[j];
					j--;
				}
			}
			else {
				if(arr[i] >= arr[j]) {
					ans += aws[k]*arr[i];
					i++;
				}
				else {
					ans += aws[k]*arr[j];
					j--;
				}
			}
		}
		System.out.println(ans);
	}

}
