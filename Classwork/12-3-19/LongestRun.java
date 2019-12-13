public class LongestRun{
  public static void main(String[] args){
    int currentRun = 1;
    int prevNum = StdIn.readInt();
    int longestRunLen = 0;
    int longestRunNum = 0;
    while(!StdIn.isEmpty()){
      int x = StdIn.readInt();
      if(x == prevNum){
        currentRun += 1;
        if(currentRun > longestRunLen){
          longestRunLen = currentRun;
          longestRunNum = x;
        }
      }
      else{
        currentRun = 1;
      }
      prevNum = x;
    }
    System.out.println("Longest run: " + longestRunLen + " consecutive " + longestRunNum + "s");
  }
}
