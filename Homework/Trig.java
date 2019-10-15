public class Trig{
    public static void main(String[] args){
	double a = Double.parseDouble(args[0]) * Math.PI / 180;
	System.out.println("sin(" + a + ") = " + Math.sin(a));
	System.out.println("cos(" + a + ") = " + Math.cos(a));
	System.out.println("tan(" + a + ") = " + Math.tan(a));
	System.out.println("sin(" + a + ") / cos(" + a + ") = tan(" + a + ")");
	System.out.println(Math.sin(a) + " / " +  Math.cos(a) + " = " + Math.tan(a));
	System.out.println("sin(" + a + ") * sin(" + a + ") + cos(" + a + ") * cos(" + a + ") = 1.0");
	System.out.println(Math.pow(Math.sin(a), 2) + " + " + Math.pow(Math.cos(a), 2) + " = 1.0");
    }
}
