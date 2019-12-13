/*  $ java FormatGraduationRates
     *      Alabama        189,259       31.5%
     *      Alaska          31,967       32.9%
     *      Arizona        283,867       33.0%
     *      Arkansas       105,468       28.6%
     *      California   1,999,766       37.9%
*/

public class FormatGraduationRates{
    public static void main(String[] args){
	String[][] states = {
	    {"Alabama", "189,259", "31.5"},
	       {"Alaska", "31,967", "32.9"},
	       {"Arizona", "283,867", "33.0"},
	       {"Arkansas", "105,468", "28.6"},
	       {"California", "1,999,766", "37.9"},	    
	};
	for(int i = 0; i < states.length; i++){
	    String p = "%";
	    System.out.printf("%-15s %15s %10.4s%s \n", states[i][0], states[i][1], states[i][2], p);
	}
    }
}
