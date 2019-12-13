public class Circles{
  public static void main(String[] args){
    int numCircles = Integer.parseInt(args[0]);
    double blackProb = Double.parseDouble(args[1]);
    double minRad = Double.parseDouble(args[2]);
    double maxRad = Double.parseDouble(args[3]);
    for(int i = 0; i < numCircles; i++){
      double x = Math.random();
      double y = Math.random();
      boolean isBlack = Math.random() < blackProb;
      double rad = (Math.random() * (maxRad - minRad)) + minRad;
      if(isBlack) StdDraw.setPenColor(StdDraw.BLACK);
      else StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledCircle(x, y, rad);
    }
  }
}
