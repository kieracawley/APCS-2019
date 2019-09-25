public class IntegerTest{
    public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = -a;
	String binaryA = Integer.toBinaryString(a);
	String binaryB = Integer.toBinaryString(b);
	System.out.println(binaryA);
	System.out.println(binaryB);
	System.out.println(Integer.numberOfLeadingZeros(a));
	System.out.println(Integer.SIZE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
    }
}
