package project12;

public class Rotate {
	private static int[][] matrix;
	private static void swapy(int x, int y){
       // System.out.println(x +" " + y);
        x = x * y;
        y = x/y;
        x = x/y;
       // System.out.println(x +" " + y);
    }
    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        int  k= 0;
        for(int i = 0; i < n; ++i){
          k = n-1;
            for(int j = 0; j < k; j++){
            	int x = matrix[j][i];
            	int y = matrix[k][i];
               // swapy(x,y);
                matrix[j][i] = y;
                matrix[k][i] = x;
                k--;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
            	int x = matrix[i][j];
            	int y = matrix[j][i];
            	//swapy(x,y);
            	matrix[i][j] = y;
            	matrix[j][i] = x;            }
        }
    }

	public static void main(String[] args) {
		 	 matrix = new int[][] {{1,2,3},{4, 5,6},{7,8,9}};//{{1,2,3,4}, {5,6,7,8},{9, 10, 11, 12},{13, 14, 15, 16}};
		rotate(matrix);
		int n = matrix.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println(" ");
		}
		
		
	}
}
