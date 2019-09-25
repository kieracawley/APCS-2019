public class Swap{
    public static void main(String[] args){
	int a = args[0];
	int b = args[1];
	int t = a;
	a = b;
	b = t;
	System.out.println("a = " + a + ", b = " + b);
    }
}
