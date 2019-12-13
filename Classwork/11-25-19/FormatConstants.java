/* $java FormatConstants
 *  Foating-point format (%f) :
 *
 *  d |     pi     | speed of light | fine structure
 *  ---+------------+----------------+----------------
 *  1 |        3.1 |    299792458.0 |           0.0 |
 *  2 |       3.14 |   299792458.00 |          0.01 |
 *  3 |      3.142 |  299792458.000 |         0.007 |
 *  4 |     3.1416 | 299792458.0000 |        0.0073 |
 *
 *  Exponential format (%E) :
 *
 *  d |     pi     | speed of light | fine structure
 *  ---+------------+----------------+----------------
 *  1 |    3.1E+00 |        3.0E+08 |       7.3E-03 |
 *  2 |   3.14E+00 |       3.00E+08 |      7.26E-03 |
 *  3 |  3.142E+00 |      2.998E+08 |     7.257E-03 |
 *  4 | 3.1416E+00 |     2.9979E+08 |    7.2574E-03 |
 *
 *  General format (%G) :
 *
 *  d |     pi     | speed of light | fine structure
 *  ---+------------+----------------+----------------
 *  1 |          3 |          3E+08 |         0.007 |
 *  2 |        3.1 |        3.0E+08 |        0.0073 |
 *  3 |       3.14 |       3.00E+08 |       0.00726 |
 *  4 |      3.142 |      2.998E+08 |      0.007257 |
*/

public class FormatConstants{

    public static void main(String [] args){
      final double PI = Math.PI;
      final double SPEED_OF_LIGHT = 2.99792458E+8;
      final double FINE_STRUCTURE = 7.2573525E-3;
      int d = 4;

      String[][] formats = {
        {"Foating-point format (%f) :", "f"},
        {"Exponential format (%E) :", "E"},
        {"General format (%G) :", "G"}
      };

      for(int x = 0; x < formats.length; x++){
        System.out.println("\n" + formats[x][0] + "\n");
        System.out.println("d |     pi     | speed of light | fine structure");
        System.out.println(" ---+------------+----------------+----------------");
        for(int i = 1; i <= d; i++){
          String y = formats[x][1];
      	  double form = (i / 10.0);
      	  String formatString = "%d | %" + (form + 10) + y + " | %" + (form + 14) + y + " | %" + (form + 14) + y + " | \n";
      	  System.out.printf(formatString, i, PI, SPEED_OF_LIGHT, FINE_STRUCTURE);
        }
      }
    }
}
