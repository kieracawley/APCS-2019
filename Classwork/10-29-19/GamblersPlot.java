public class GamblersPlot{
    public static void main(String[] args){
	int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
	int t = 0;
	while(t < trials) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
		String line = "";
		for (int i = 0; i < cash; i++){
		    line = line + "*";
		}
		System.out.println(line);
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	    t += 1;
	    System.out.println("End of trial #" + t);
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);

    }
}
