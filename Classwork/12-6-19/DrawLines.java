public class DrawLines{
  public static void main(String[] args){
    StdDraw.setScale(0.0, 100.0);
    double n = Double.parseDouble(args[0]);
    for(double i = 0.0; i <= n; i += 1.0){
      StdDraw.line(0.0, n - i, i, 0.0);
    }
  }
}
