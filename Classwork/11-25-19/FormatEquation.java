/*
 * $ javac FormatEquation 3 5
 * $ 3 + 5 = 10
 *
 * java FormatEquation 123 43
 * 123 + 43 = 166
*/



public class FormatEquation{

    public static void main(String [] args){
	     int a = Integer.parseInt(args[0]);
	     int b = Integer.parseInt(args[1]);

       System.out.printf("%d + %d = %d\n", a, b, (a + b));
    }

}
