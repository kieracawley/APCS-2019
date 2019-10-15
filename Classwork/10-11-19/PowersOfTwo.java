public class PowersOfTwo{
    public static void main(String[] args){
	int num = Integer.parseInt(args[0]);
	int p = 1;
	while (p <= num){
	    System.out.println(p);
	    p = p * 2;
	}
    }
}
