/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler stake goal N
 *  
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out.
 *
 *  % java Gambler 50 250 1000
 *  178 wins of 1000
 *  Percent of games won = 17.8
 *  Avg # bets           = 10010.79
 *
 *  % java Gambler 50 150 1000
 *  337 wins of 1000
 *  Percent of games won = 33.7
 *  Avg # bets           = 4863.95
 * 
 *  % java Gambler 50 100 1000
 *  503 wins of 1000
 *  Percent of games won = 50.3
 *  Avg # bets           = 2464.59
 *
 ******************************************************************************/

public class Gambler { 

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform
	double probability = Double.parseDouble(args[3]);
	int maxbets = Integer.parseInt(args[4]);

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won
	double endingMoney = 0.0;
        // repeat trials times
	int t = 0;
	while(t < trials) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal && bets < maxbets) {
                bets++;
                if (Math.random() < probability) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	    t += 1;
	    endingMoney += cash;
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	System.out.println("Average money at end: $" + (endingMoney/trials));
    }

}

/* 
     a. If you go to Monte Carlo to try to turn $500 into $2,500 what is your chance of success?  20%

     b. How many bets should you expect to make? 1,000,000
     
     c. If you try to turn $1 into $1000 what is your chance of success? .1%

     d. How many bets should you expect to make? 1,000

3. the probability of success is determined by the formula P = (stake)/(goal)

4. average number of bets made is determined by (goal - stake) * stake 

*/
