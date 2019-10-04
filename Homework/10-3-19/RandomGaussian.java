public class RandomGaussian{
    public static void main(String[] args){
	double r = Math.sin(2 * Math.PI * Math.random()) * Math.pow((-2 * Math.log(Math.random())), (1/2));
	System.out.println(r);
    }
}
