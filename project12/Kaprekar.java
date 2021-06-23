package project12;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
	
	private static int reversed(int x) {
		int rev = 0;
		while(x != 0) {
			int y = x%10;
			rev = rev*10 + y;
			x = x/10;
		}
		return rev;
	}
	
	private static int conversion(int t) {

		String S = "";
		while(t != 0) {
			int x = t%10;
			S += x;
			//S += (char) (x + '0');
			t = t/10;
		}
		 char charArray[] = S.toCharArray();
	      Arrays.sort(charArray);
	      int n = charArray.length;
	      char c_rev[] = new char[n];
	      for (int i = n - 1; i >= 0; i--) {
	          c_rev[i] = charArray[n - i - 1];
	      }
	      
	      String P = new String(c_rev);
	     // System.out.println(P);
	      return Integer.parseInt(P);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = sc.nextInt();
		
	      int ans = t;
	      while(k != 0) {

	    	  
	    	  int num = conversion(t);
	    	  k--;
	    	  int x = reversed(num);
	    	  ans = num - x;
	    	  if(ans == 0) break;
	    	  t = ans;
	    	  
	    	  
	    	  
	      }
	      
	      System.out.println(ans);
	}
}
