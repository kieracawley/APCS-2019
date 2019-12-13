public class PointDemo{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    StdDraw.setPenRadius(Double.parseDouble(args[1]));
    for(int i = 0; i < n; i++){
      double x = Math.random();
      double y = Math.random();
      StdDraw.point(x, y);
      System.out.println(i + ": " + x + ", " + y);
    }
  }
}
