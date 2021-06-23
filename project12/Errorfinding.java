 	/**
 * 
 */
package project12;

class Solution {
	   private final static int lim = 300;
	   public int lengthOfLongestSubstring(String s) {
	       boolean[] isPresent = new boolean[lim];
	       int lengthOfS = s.length();
	       int leftP = 0;
	       int rightP = 0;
	       int result = 0;
	       while(rightP < lengthOfS) {
	           int index = (int) s.charAt(rightP);
	           if (isPresent[index]) {
	               while(s.charAt(leftP) != s.charAt(rightP)) {
	                   int leftIndex = (int) s.charAt(leftP);
	                   isPresent[leftIndex] = false;
	                   ++leftP;
	               }
	               ++leftP;
	           }
	           isPresent[index] = true;
	           int maxLength = rightP - leftP + 1;
	           result = Math.max(result, maxLength);
	           ++rightP;
	       }
	       return result;
	   }
	   
	}

/**
 * @author Sanghpriya
 *
 */
public class Errorfinding {
	public static void main(String args[]){
		String x = "bcdb";
		Solution sol = new Solution();
		System.out.println(sol.lengthOfLongestSubstring(x));
		
	}

}
