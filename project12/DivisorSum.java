package project12;

public class DivisorSum {
	public static void main(String[] args) {
		long n = 765;
		long sum = 0;
		long x = n;
		for(int i = 1; i*i < n; ++i) {
			if(n%i == 0) {
				sum += i;
				sum += n/i;
						
			}
		}
		System.out.println(sum);
	}

}
