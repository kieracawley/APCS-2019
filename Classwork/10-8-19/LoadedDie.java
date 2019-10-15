public class LoadedDie{
    public static void main(String[] args){
	int num = (int) (Math.random() * 8 + 1);
	if (num > 6) System.out.println(6);
	else System.out.println(num);
    }
}
