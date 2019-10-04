public class RandomInclusive{
    public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	double n = Math.random();
	int myNum = (int) ((Math.abs(b - a) + 1) * n ) + Math.min(a,b);
	System.out.println(myNum);
    }
}
