package project12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TopView {
	
	private static int nodeCount;
	   private static List<List<Integer>> graph = new ArrayList<List<Integer>>();
	   private static boolean[]  visited = new boolean[100001];
	/*public static void DFS(int i, boolean[] visited, List<List<Integer>> graph) {
		visited[i] = true;
		nodeCount++;
		Iterator<Integer> it = graph.get(i).listIterator();
		while(it.hasNext()) {
			int p = it.next();
			if(!visited[p]) {
				DFS(p, visited, graph);
			}
			
		}
		
	}*/
	public static void BFS(int C) {
		

		Queue<Integer> q = new LinkedList<Integer>();
		visited[C] = true;
		q.add(C);
		while (q.size() != 0) {
			int x = q.peek();
			q.remove();
			Iterator<Integer> it = graph.get(x).listIterator();
			while(it.hasNext())
			 {
				int ch = it.next();
				if (visited[ch] == false) {
					visited[ch] = true;
					q.add(ch);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1, 6},{2, 7}, {3, 8}, {4 ,9}, {2, 6}};
		
		int n = arr.length;
		for(int i = 0; i <= n+n; i++) {
			graph.add(new ArrayList<>());
			
		}
		for(int i = 0; i < n; ++i) {
			graph.get(arr[i][0]).add(arr[i][1]);	
			graph.get(arr[i][1]).add(arr[i][0]);}
		
		
		int mx = 0;
		int mn = 2 * n;
		for(int i= 1; i <= n+n; i++) {
			if(visited[i] == false) {
				nodeCount = 0;
				BFS(i);
				if (nodeCount > 1) {
					mx = Math.max(mx, nodeCount);
					mn = Math.min(mn, nodeCount);
				}
			}
		}
		
		System.out.println(mn + " " + mx );
		 
		//int[] arr1;
		
	
	
	}
	


}
