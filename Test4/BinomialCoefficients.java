public class BinomialCoefficients{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int[][] pascals = new int[n][];

    // Generate n rows of Pascal's triangle
    for(int i = 0; i < n; i++){
      pascals[i] = new int[i + 1];
      for(int x = 0; x <= i; x++){
        if(x == 0 || x == i){
          pascals[i][x] = 1;
        }
        else{
          pascals[i][x] = pascals[i - 1][x] + pascals[i - 1][x - 1];
        }
      }
    }
    System.out.println(" Pascal's Triangle                   Binomial Distribution");
    System.out.println("---------------------------------------------------------------");
    for(int i = 0; i < n; i++){
      String row = " ";
      // Add pascal numbers to the row
      for(int x = 0; x <= i; x++){
        row = row + pascals[i][x] + "  ";
        if(pascals[i][x] < 10){
          row += " ";
        }
      }

      // Adjust the spacing
      for(int x = i; x < n; x++) row += "    ";
      row += "    ";

      //Calculates binomial distribution and simplifies fractions
      for(int x = 0; x <= i; x++){
        if(i == 0) row += "1";
        else{
          int den = (int) Math.pow(2, i);
          int num = pascals[i][x];
          while(num % 2 == 0){
            num = num / 2;
            den = den / 2;
          }
          row += num + "/" + den + " ";
          if(den < 10) row += " ";
          if(num < 10) row += " ";
        }
      }
      System.out.println(row);
    }
  }
}
