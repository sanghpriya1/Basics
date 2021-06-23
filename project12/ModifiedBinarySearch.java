/**
 * 
 */
package project12;

import java.util.Scanner;

/**
 * @author Sanghpriya
 *
 */
public class ModifiedBinarySearch {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[] search = new int[size];
	for(int i = 0; i < size; ++i) {
		search[i] = sc.nextInt();
	}
	sc.close();
	for(int i = 0; i < size; ++i)
	System.out.println(search[i]);
	}

}
