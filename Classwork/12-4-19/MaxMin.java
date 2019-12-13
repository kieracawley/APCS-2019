public class MaxMin {
    public static void main(String[] args) {
        int min = StdIn.readInt();
        int max = min;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x > max) max = x;
            if (x < min) min = x;
        }
        StdOut.println("max: " + max + ", min: " + min);
    }
}
