public class Circle{
  public static void main(String[] args){
    StdDraw.setScale(-2.0, 2.0);
    int n = Integer.parseInt(args[0]);
    for(int i = 0; i < n; i++){
      double angle = (360.0 / n) * (i + 1);
      double x = Math.cos(angle);
      double y = Math.sin(angle);
      StdDraw.point(x, y);
    }
  }
}
