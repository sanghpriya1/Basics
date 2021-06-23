/**
 * 
 */
package project12;

class Result{
	
	public int lnrst(String s) {
		
		       boolean[] isPresent = new boolean[300];
		       int lengthOfS = s.length();
		       int leftP = 0;
		       int rightP = 0;
		       int result1 = 0;
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
		           result1 = Math.max(result1, maxLength);
		           ++rightP;
		       }
		       return result1;
		   }
		   
	}
	

/**
 * @author Sanghpriya
 *
 */
public class Rainwatertrapping {
	public static void main(String args[]) {
		String s = "Hello";
		Result result = new Result();
		System.out.println(result.lnrst(s));
	}

}
