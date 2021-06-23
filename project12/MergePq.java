/**
 * 
 */
package project12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Sanghpriya
 *
 */
 class Node {
	private int value;
	private int listNumber;
	private int currentIndex;
	public Node(int value, int listNumber, int currentIndex) {
		this.value = value;
		this.listNumber = listNumber;
		this.currentIndex = currentIndex;
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the listNumber
	 */
	public int getListNumber() {
		return listNumber;
	}
	/**
	 * @param listNumber the listNumber to set
	 */
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	/**
	 * @return the currentIndex
	 */
	public int getCurrentIndex() {
		return currentIndex;
	}
	/**
	 * @param currentIndex the currentIndex to set
	 */
	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	
	@Override
    public String toString() {
        return "Node{" +
                "value='" + this.value + '\'' +
                ", listNumber=" + this.listNumber +
                ", currentIndex" + this.currentIndex +
                '}';
    }
}
 
class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		if (o1.getValue() > o2.getValue()) {
    		return 1;
    	}
    	if (o1.getValue() < o2.getValue()) {
    		return -1;
    	}
    	return 0;
	}
	
}

public class MergePq {
		public static void main(String args[]) {
			List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			Scanner sc = new Scanner(System.in);
			
			int size = sc.nextInt();
		
			//System.out.println(size);
			
			for(int i = 0; i < size; i++) {
				int listSize = sc.nextInt();
				ArrayList<Integer> arr = new ArrayList<>(listSize); 
				for(int j = 0; j < listSize; j++) {
					int x = sc.nextInt();
					arr.add(j, x);
				}
			
				list.add(arr);
				
			}
			sc.close();
	
	PriorityQueue<Node> pq = new PriorityQueue<>(3, new NodeComparator());
	for(int index = 0; index < list.size(); ++index) {
		pq.add(new Node(list.get(index).get(0), index, 0));
	}
	List<Integer> answer = new ArrayList<>();
	while(!pq.isEmpty()) {
		Node head = pq.poll();
		answer.add(head.getValue());
		if(head.getCurrentIndex() + 1 < list.get(head.getListNumber()).size()) {
			pq.add(new Node(list.
					get(head.getListNumber()).
					get(head.getCurrentIndex() + 1),
					head.getListNumber() , head.getCurrentIndex() + 1));
		}
	}
	for(int i = 0; i < answer.size(); i++) {
		System.out.print(answer.get(i) + " ");
	}
	
}
}
