
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
			int mini = Integer.MAX_VALUE;
			for(int i = 0; i < N; i++) {
				
				arr[i] = sc.nextInt();
				mini = Math.min(mini, arr[i]);
				if(!hmp.containsKey(arr[i])) {
					
					hmp.put(arr[i], 1);
					
				}
				else
				{
					hmp.put(arr[i], hmp.get(arr[i])+1);
				}
				
			}
			
			mini = hmp.get(mini);
			mini = N - mini;
			System.out.println(mini);
			
		}
		sc.close();
	}

}
