public class Filter{
  public static void main(String[] args){
    int prevInt = StdIn.readInt();
    String ints = "" + prevInt;
    while(!StdIn.isEmpty()){
      int x = StdIn.readInt();
      if(x != prevInt) ints = ints + " " + x;
      prevInt = x;
    }
    StdOut.println(ints);
  }
}
