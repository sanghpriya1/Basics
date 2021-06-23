package project12;

import java.util.PriorityQueue;

public class Sat {

	private static int firstZero(int[] art) {
		int low = 0;
		int high = art.length;
		if (art[high - 1] == 1)
			return high;
		int ans = 0;
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (art[mid] == 0) {
				if(mid == 0)return 0;
				if (art[mid - 1] == 1) {
					ans = mid;
					break;
				}
				high = mid - 1;
			} else {
				if (art[mid] == 1) {
					if (art[mid + 1] == 0) {
						ans = mid + 1;
						break;
					}
					low = mid + 1;
				}
			}
		}

		return ans;

	}

	public static void main(String[] args) {
		int[][] mat = new int[][] { { 1,1,1,0}, { 1,1,0,0 }, { 1,1,1,1 }, { 1,1,1,1 }, {0,0,0,0}, {1,1,1,0} };

		int k = 6;
		
		int n = mat.length;
		int[] arr = new int[n];
		int[] ans = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = firstZero(mat[i]);
			

		}
		
		PriorityQueue<IndexValuePair> pq = new PriorityQueue<IndexValuePair>(k, new ValueComparator());
		for (int i = 0; i < n; i++) {
			pq.add(new IndexValuePair(i, arr[i]));
		}

		int j = 0;
		while (!pq.isEmpty()) {
			IndexValuePair temp = pq.poll();
			ans[j] = temp.getIndex();
			//System.out.println(ans[j]);
			j++;
		}
		 int[] aws = new int[k];
		for(int i = 0; i < k;i++) {
			aws[i]=ans[i];
			System.out.print(ans[i]);
			System.out.print(" ");
		}

	}

}
