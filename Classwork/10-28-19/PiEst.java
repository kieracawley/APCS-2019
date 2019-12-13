public class PiEst{
    public static void main(String[] args){
	int terms = Integer.parseInt(args[0]);
	double sum = 0.0;
	for (int i = 1; i <= terms; i++){
	    sum = sum + ((1.0/i)/ i);
	}
	double pi = Math.sqrt(sum * 6);
	System.out.println(pi);
    }
}
