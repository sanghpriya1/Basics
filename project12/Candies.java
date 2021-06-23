package project12;

import java.util.HashSet;

public class Candies {
	public static void main(String[] args) {
		int[] candyType = new int[] {6,6,6,6};
		HashSet<Integer> hst = new HashSet<>();
		int n = candyType.length;
		for(int i = 0; i < n; i++) {
			hst.add(candyType[i]);
		}
		int k = hst.size();
		n = n/2;
		int ans = 0;
		if(n <= k) ans = n;
		else ans = k;
		System.out.println(ans
				);
	}
	
}
