/* Given two vectors,v1 and v2, of length n that are represented with
   one-dimensional arrays, write a code fragment that computes the Euclidean
   distance between them (the square root of the sums of the squares of the
   differences between corresponding element).*/

public class Q1{
  public static void main(String[] args){
    double [] v1 = {1.0, 5.0, -9.0};
    double [] v2 = {-3.0, 7.0, 7.4};
    int dimensions = v1.length;
    double sum = 0.0;
    for(int i = 0; i < dimensions; i++){
      double diff = v1[i] - v2[i];
      sum += Math.pow(diff, 2);
    }
    double euclideanDistance = Math.sqrt(sum);
    System.out.println(euclideanDistance);
  }
}
