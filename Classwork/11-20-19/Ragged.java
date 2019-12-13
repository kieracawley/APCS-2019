public class Ragged{
    public static void main(String[] args){
	int[][] b = {
	    {1},
	    {2, 3},
	    {4, 5, 6}
	}
	int len = Integer.parseInt(args[0]);

	int[][] a = new int[len][];
	for(int i = 0; i < len; i++){
	    a[i] = new int[(int)Math.pow(2, i)];
	    for(int x = 0; x < (int) Math.pow(2, i); x++){
		a[i][x] = 0;
		System.out.println(i + " " + x);
	    }
	}
	int m = 5;
	int n = 5;

	double[][] mn = new double[m][n];
	for(int i = 0; i < m; i++){
	    mn[i] = new double[n];
	    for(int x = 0; x < n; x++;){
		
	    }
	}
    }
}
