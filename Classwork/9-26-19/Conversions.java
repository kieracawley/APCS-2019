public class Conversions{
    public static void main(String[] args){
	double m = Double.parseDouble(args[0]);
	double ft = (int)((m / 0.0254) / 12);
	double in = (m / 0.0254) - (ft * 12);
	System.out.println(ft + " feet, " + in + " inches");
    }
}
