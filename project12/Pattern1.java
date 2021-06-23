/**
 * 
 */
package project12;

/**
 * @author Sanghpriya
 *
 */
class Pattern{
	public void even1(int x, int y) {
		int a = x;
		x = y;
		y = a;
	System.out.println(x);
	System.out.println(y);
	}
}
public class Pattern1 {
		public static void main(String args[]) {
			int x = 5;
			int v = 10;
			Pattern ans = new Pattern();
			System.out.println(ans.even1(x, v));
		}
}
