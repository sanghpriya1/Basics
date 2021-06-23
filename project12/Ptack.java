package project12;

import java.util.Scanner;

public class Ptack {
		private static int LastDigit(int K) {
				int x = K%10;
				if(x == 0)
			
			return 1;
	
}
	private static void reverse(int K) {
		int rev = 0;
		while(K-- > 0) {
			rev = rev * LastDigit(K);
			K = K / 10;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = sc.nextInt();
		int K = sc.nextInt();
		while(K-- > 0) {
			
		}
		System.out.println(N);
				sc.close();
	}

}
