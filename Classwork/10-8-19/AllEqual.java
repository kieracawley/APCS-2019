public class AllEqual{
    public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	String ans = (a == b && b == c)? "All Equal": "Not equal";
	System.out.println(ans);
    }
}
