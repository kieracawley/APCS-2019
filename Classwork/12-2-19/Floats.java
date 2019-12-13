public class Floats{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    double[] nums = new double[n];
    double sum = 0.0;
    for(int i = 0; i < n; i++){
      nums[i] = StdIn.readDouble();
      sum += nums[i];
    }
    double mean = sum / n;
    System.out.println(mean);
  }
}
