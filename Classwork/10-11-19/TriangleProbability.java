public class TriangleProbability{
    public static void main(String[] args){
	int triangle = 0;
	int x = 0;
	while (x < 1000000){
	    double a = Math.random();
	    double b = Math.random();
	    double c = Math.random();
	    if ((a + b) > c && (a + c) > b && (b + c) > a) triangle = triangle + 1;
	    x = x + 1;
	}
	System.out.println(triangle / 1000000.0);
    }
}
