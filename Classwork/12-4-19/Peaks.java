public class Peaks{
  public static void main(String[] args){
    int width = StdIn.readInt();
    int height = StdIn.readInt();
    int[][] elevations = new int[height][width];

    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        elevations[y][x] = StdIn.readInt();
      }
    }

    int peaks = 0;
    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        boolean isPeak = true;
        if(x != 0 && elevations[y][x-1] > elevations[y][x]) isPeak = false;
        if(x != width - 1 && elevations[y][x+1] > elevations[y][x]) isPeak = false;
        if(y != 0 && elevations[y - 1][x] > elevations[y][x]) isPeak = false;
        if(y != height - 1 && elevations[y + 1][x] > elevations[y][x]) isPeak = false;
        if(isPeak) peaks++;
      }
    }

    StdOut.println("Number of peaks: " + peaks);
  }
}
