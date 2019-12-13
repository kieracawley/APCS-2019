public class Distinct{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int[] nums = new int[n - 1];
    for(int i = 0; i < nums.length; i++){
      boolean valid = false;
      while(!valid){
        int x = Integer.parseInt(StdIn());
        inArray = false;
        for(int y = 0; y <= i; i++){
          if(nums[y] == x){
            inArray = true;
          }
        }
        if(!inArray && (x <= n) && (x >= 1)){
          nums[i] = x;
          valid = true;
        }
      }
    }

    for(int i = 0; i < nums.length; i++){
      boolean notIncluded = true;
      for(int x = 0; x < nums.length; x++){
        if (nums[x] == i) notIncluded = false;
      }
      if (notIncluded) System.out.println(i + " is not included.");
    }
  }
}
