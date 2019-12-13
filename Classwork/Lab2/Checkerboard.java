/* 
   Write a program Checkerboard.java that takes an integer command-line
   argument N, and uses two nested for loops to print an N-by-N "checkerboard"
   pattern like the one below: a total of NxN asterisks, where each row has
   2N characters (alternating between asterisks and spaces). 
*/
public class Checkerboard{
    public static void main(String[] args){
	int dimension = Integer.parseInt(args[0]);
	for(int y = 0; y < dimension; y++){
	    String row = "";
	    for(int x = 0; x < dimension * 2; x++){
		if(x % 2 == y % 2){
		    row = row + "*";
		}
		else{
		    row = row + " ";
		};
	    }
	    System.out.println(row);
	}
    }
}
