public class PowersOfK{
    public static void main(String[] args){
	long pow = Long.parseLong(args[0]);
	long n = 1;
	while(n <= Long.MAX_VALUE && n < (n * pow)){
	    System.out.println(n);
	    n = n * pow;
	}
	System.out.println(n);
    }
}
