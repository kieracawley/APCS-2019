/* How would you write a single declaration that initializes the variable
   board to the two-dimensional array containig the following strings
   (empty spaces should contain the space character), which corresponds
   to the starting position of a chess board:

      	  	   _______________
		  |r|n|b|q|k|b|n|r|
		  -----------------
		  |p|p|p|p|p|p|p|p|
		  -----------------
		  | | | | | | | | |
		  -----------------
		  | | | | | | | | |
		  -----------------
		  | | | | | | | | |
		  -----------------
		  | | | | | | | | |
		  -----------------
		  |P|P|P|P|P|P|P|P|
		  -----------------
		  |R|N|B|Q|K|B|N|R|
		  -----------------

   The array must only contains the letters shown above and the empty space.
   Do not store any other characters. */
public class Q2{
  public static void main(String[] args){
    String[][] chess = {
      {"r", "n", "b", "q", "k", "b", "n", "r"},
      {"p", "p", "p", "p", "p", "p", "p", "p"},
      {" ", " ", " ", " ", " ", " ", " ", " "},
      {" ", " ", " ", " ", " ", " ", " ", " "},
      {" ", " ", " ", " ", " ", " ", " ", " "},
      {" ", " ", " ", " ", " ", " ", " ", " "},
      {"P", "P", "P", "P", "P", "P", "P", "P"},
      {"R", "N", "B", "Q", "K", "B", "N", "R"}
    };
  }
}
