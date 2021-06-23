package project12;

import java.util.Scanner;

public class AddBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int n = a.length();
		int m = b.length();
		String ans = "";
		int carry = 0; 
		while( (m-- > 0) && (n-- > 0)) {
			int x = a.charAt(n) - '0';
			int y = b.charAt(m) - '0';
			x = x + y + carry;
			carry = x /2;
			x = x%2;
			ans += x;
			
		}
		while(m-- >0) {
			int x = b.charAt(m) - '0';
			x += carry;
			carry = x/2;
			x = x%2;
			ans += x;
		}
		while(n-- >0) {
			int x = a.charAt(n
					) - '0';
			x += carry;
			carry = x/2;
			x = x%2;
			ans += x;
		}
		if(carry != 0) {
			ans += carry; 
		}
		
		StringBuilder sb=new StringBuilder(ans);  
	    sb.reverse();  
	  ans =  sb.toString();  
		System.out.println(ans);
		
	}

}
