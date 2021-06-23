/**
 * 
 */
package project12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sanghpriya
 *
 */
public class MergeKSort {
		
		public static ArrayList<Integer> kmerge(ArrayList<Integer> l, ArrayList<Integer> m) {
			ArrayList<Integer> new1 = new ArrayList<Integer>();
			int n = l.size();
			int k = m.size();
			int i = 0; 
			int j = 0;
			while(i < n && j < k) {
				if(l.get(i) <= m.get(j)) {
					int x = l.get(i);
					new1.add(x);
					i++;
				}
				else {
					int x = m.get(i);
					new1.add(x);
					j++;
				}
			}
			if(i == n) {
				while(j < k) {
					int x = m.get(j);
					new1.add(x);
					j++;
				}
			}
			else {
				while(i < n) {
					int x = l.get(i);
					new1.add(x);
					i++;
				}
			}
			return new1;
		}
		public static void main(String args[]) {
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
	
		System.out.println(size);
		
		for(int i = 0; i < size; i++) {
			int listSize = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>(listSize); 
			for(int j = 0; j < listSize; j++) {
				int x = sc.nextInt();
				arr.add(j, x);
			}
		
			list.add(arr);
			
		}
		sc.close();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++ ) {
			 ans = kmerge(ans, list.get(i));
			
		}
			
		
		for(int i = 0 ; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
		
		
	}
}
