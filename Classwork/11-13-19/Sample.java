public class Sample{
    public static void main(String[] args){
	String[] suits = {"clubs", "diamonds", "hearts", "spades"};
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	String[] deck = new String[52];
	int k = 0;
	for(int i = 0; i < suits.length; i++){
	    for(int j = 0; j < ranks.length; j++){
		deck[k++] = ranks[j] + " of " + suits[i];
	    }
	}
	int[] indexes = new int[deck.length]; 
	for(int i = 0; i < deck.length; i++) indexes[i] = i;
	for(int i = 0; i < 5; i++){
	    int r = i + (int) (Math.random() * (deck.length - i));
	    int t = indexes[r];
	    indexes[r] = indexes[i];
            indexes[i] = t;
	}
	for(int i = 0; i < 5; i++) System.out.println(deck[indexes[i]]);
    }
}
