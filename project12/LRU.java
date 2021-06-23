/**
 * 
 */
package project12;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Sanghpriya
 *
 */                     
public class LRU { 
	public static void main(String[] args){
		Deque<Integer> frame1 = new LinkedList<Integer>();
		int[] stream = {1, 2, 3, 4, 1, 5, 6, 7, 8, 3};
		int i = 0;
		int pageFault = 0;
		int n = stream.length;
		HashSet<Integer> hash= new HashSet<>();
		int cacheSize = 4;
		
		while(i < n) {
			if(!hash.contains(stream[i])) {
				pageFault++;
				if(frame1.size() == cacheSize) {
				int x =	frame1.removeLast();
				hash.remove(x);
				}
				
			}
			else {
				frame1.remove(stream[i]);
			}
			frame1.push(stream[i]);
			hash.add(stream[i]);
			i++;
		}
		System.out.println("Total Pagefault " + " " + pageFault +" " + "Initial Queue " + frame1);
	}

}
