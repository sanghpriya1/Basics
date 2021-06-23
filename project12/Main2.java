package project12;

import java.util.Scanner;

public class Main2 {
	private static int len = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
	//	System.out.println(S);
		int x = -1;
		char[] P = S.toCharArray();
		for(int i = 0; i< P.length; ++i) {
			int z = (P[i] - '0');
			x = Math.max(x, z);
		}
		System.out.println(x);
		
	}

}
