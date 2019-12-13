public class Tile3{
  public static void main(String[] args){
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledSquare(0.5, 0.5, 0.5);
    StdDraw.setPenColor(StdDraw.GRAY);
    double[] x = {0.5, 1, 0.5, 0};
    double[] y = {1, 0.5, 0, 0.5};
    StdDraw.filledPolygon(x, y);
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledSquare(0.125, 0.125, 0.125);
    StdDraw.filledSquare(0.125, 0.875, 0.125);
    StdDraw.filledSquare(0.875, 0.125, 0.125);
    StdDraw.filledSquare(0.875, 0.875, 0.125);
  }
}
