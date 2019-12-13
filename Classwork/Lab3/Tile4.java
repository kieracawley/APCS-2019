public class Tile4{
  public static void main(String[] args){
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledSquare(0.5, 0.5, 0.5);
    StdDraw.setPenColor(StdDraw.GRAY);
    double[] x = {0.5, 1, 0.5, 0};
    double[] y = {1, 0.5, 0, 0.5};
    StdDraw.filledPolygon(x, y);
    StdDraw.setPenColor(StdDraw.WHITE);
    double[] x1 = {0.25, 0.375, 0.125, 0};
    double[] y1 = {1, 0.875, 0.625, 0.75};
    StdDraw.filledPolygon(x1, y1);
    double[] x2 = {0.75, 1, 0.875, 0.625};
    double[] y2 = {1, 0.75, 0.625, 0.875};
    StdDraw.filledPolygon(x2, y2);
    double[] x3 = {0.875, 1, 0.75, 0.625};
    double[] y3 = {0.375, 0.25, 0, 0.125};
    StdDraw.filledPolygon(x3, y3);
    double[] x4 = {0.125, 0.375, 0.25, 0};
    double[] y4 = {0.375, 0.125, 0, 0.25};
    StdDraw.filledPolygon(x4, y4);
    StdDraw.setPenColor(StdDraw.GRAY);
    StdDraw.filledSquare(0.125, 0.125, 0.125);
    StdDraw.filledSquare(0.125, 0.875, 0.125);
    StdDraw.filledSquare(0.875, 0.125, 0.125);
    StdDraw.filledSquare(0.875, 0.875, 0.125);
  }
}
