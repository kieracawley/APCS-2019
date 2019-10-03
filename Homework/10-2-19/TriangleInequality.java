public class TriangleInequality{
    public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
	boolean isValid = true;
	isValid = isValid && (a + b > c);
	isValid = isValid && (a + c > b);
	isValid = isValid && (b + c <= a);
	System.out.println(isValid);
    }
}
