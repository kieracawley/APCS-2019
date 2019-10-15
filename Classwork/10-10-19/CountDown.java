public class CountDown{
    public static void main(String[] args){
	int x = Integer.parseInt(args[0]);
	while (x > 0){
	    System.out.println(x);
	    x = x - 1;
	}
	if (x == 0) System.out.println("BLASTOFF");
    }
}
