public class Ordered{
    public static void main(String[] args){
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	System.out.println((x >= y && y >= z) || (x <= y && y <= z));
    }
}
