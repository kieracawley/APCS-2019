public class TenHellos{
    public static void main(String[] args){
	int num = Integer.parseInt(args[0]);
	int count = 1;
	while(count <= num){
	    String ending = "th";
	    if (count % 10 == 1 && count % 100 != 11) ending = "st";
	    if (count % 10 == 2 && count % 100 != 12) ending = "nd";
	    if (count % 10 == 3 && count % 100 != 13) ending = "rd";
	    System.out.println(count + ending);
	    count = count + 1;
	}
    }
}
