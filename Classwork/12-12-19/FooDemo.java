public class FooDemo{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println("foo(" + n + ") = " + foo((double) n));
  }
  public static int foo(int x){
    return 3 * x + 2;
    // System.out.println("Hello");
  }
}

// 1) Stll works
// 2) Compiler error
// 3) Compiler error
// 4) Error: unreachable statement
