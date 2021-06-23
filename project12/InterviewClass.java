package project12;

import java.util.Stack;

public class InterviewClass {
		public static void main(String[] args) {
			int[] arr = new int[] {13, 5, 7, 6, 12};
			
			int n = arr.length;
			int[] ans  = new int[n];
			Stack<Integer> S = new Stack<>();
			for(int i = 0; i < n; i ++) {
//				if(S.empty()) {
//					S.push(i);
//				}
				while(!S.empty() && arr[S.peek()] < arr[i]) {
					ans[S.peek()] = arr[i];
					S.pop();
					
					
				}
				S.push(i);
				
			}
			while(!S.empty()) {
				ans[S.peek()] = -1;
				S.pop();
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(ans[i]);
			}
			
		}
		
}
