public class Distinct{
    public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int out = 2;
	if (a == b && b == c) out = 1;
	if (a != b && b != c && a != c) out = 3;
	System.out.println(out);
    }
}
