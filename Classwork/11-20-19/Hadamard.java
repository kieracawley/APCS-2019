public class Hadamard{
    public static void main(String[] args){
	int iterations = Integer.parseInt(args[0]);
	int len = Math.pow(2, iterations);
	boolean[][] h = new boolean[len][len];
	h[0][0] = true;
	for(int n = 0; n < iterations; n++){
	    for(int x = 0; x < len; x++){
		for(int y = 0; y < len; y++){
		    h[x][y] = !(h[x % n][y % n]);		
		    if(x >= Math.pow(2, n) && y >= Math.pow(2, n)){
			h[x][y] = !h[x][y];
		    }
		}
	    }
	}
	for(int x = 0; x < len; x++){
	    for(int y = 0; y < len; x++){
	    }
	}
    }
}
