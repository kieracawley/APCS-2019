import java.util.Arrays;
public class Rumors{
    public static void main(String[] args){
	int trials = 100000;
	int allHeard = 0;
	int numWhoHeard = 0;
	for(int x = 0; x < trials; x++){
	    int guestCount = Integer.parseInt(args[0]) - 1;
	    Boolean[] guests = new Boolean[guestCount];
	    guests[0] = true;
	    for(int i = 1; i < guestCount; i++){
		guests[i] = false;
	    }
	    Boolean complete = false;
	    int prevGuest = 0;
	    while(!complete){
		int newGuest = (int)(Math.random() * (guestCount - 1));
		if (newGuest >= prevGuest) newGuest++;
		if (guests[newGuest] == true){
		    complete = true;
		}
		else{
		    prevGuest = newGuest;
		    guests[newGuest] = true;
		}
	    }
	    Boolean all = true;
	    for(int i = 0; i < guestCount; i++){
		if(guests[i] == true){
		    numWhoHeard++;
		}
		else{
		    all = false;
		}
	    }
	    if(all == true) allHeard++;
	}
	System.out.println("Probability All Hear Rumor: " + (allHeard * 1.0 /trials));
	System.out.println("Avg Num Of People Who Hear Rumor: " + (numWhoHeard * 1.0 /trials + 1));
    }
}
