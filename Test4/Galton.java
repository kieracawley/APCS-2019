public class Galton{
  public static void main(String[] args){
    int marbles = Integer.parseInt(args[0]);
    int channelCount = Integer.parseInt(args[1]);
    /* Creating array of channels and setting inital number of marbles in each to 0 */
    int[] channels = new int[channelCount];
    for(int i = 0; i < channelCount; i++) channels[i] = 0;


    for(int i = 0; i < marbles; i++){
      /* Marble starts in the center of the channels */
      double start = channelCount / 2.0 + 0.5;
      for(int n = 0; n < (channelCount - 1); n++){
        /* 50% chance of moving 0.5 channels to the left or 0.5 channels to the right */
        double direction = Math.random();
        if(direction < 0.5) start -= 0.5;
        else start += 0.5;
      }
      /* Add 1 to the channel in which the marble falls */
      channels[(int)start - 1] = channels[(int)start - 1] + 1;
    }

    /* Creates a table of the channels and # of marbles in each */
    System.out.println("Channel        Marbles");
    System.out.println("---------------------");
    for(int i = 0; i < channelCount; i++){
      String x = i + "              ";
      for(int n  = 0; n < channels[i]; n++){
        x = x + "*";
      }
      System.out.println(x);
    }
  }
}
