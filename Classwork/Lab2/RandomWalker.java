/*
  Write a program RandomWalker.java that takes an integer command-line
  argument N and simulates the motion of a random walker for N steps.
  After each step, print the location of the random walker, treating
  the lamp post as the origin (0, 0). Also, print the square of the
  final distance from the origin.
 */

public class RandomWalker{
    public static void main(String[] args){
	int steps = Integer.parseInt(args[0]);
	int x = 0;
	int y = 0;
	while(steps > 0){
	    int direction = (int)(Math.random() * 4);
	    if (direction == 0) x += 1;
	    if (direction == 1) x -= 1;
	    if (direction == 2) y += 1;
	    if (direction == 3) y -= 1;
	    steps -= 1;
	    System.out.println("(" + x + ", " + y + ")");
	}
	int squaredDistance = x * x + y * y;
	System.out.println("squared distance: " + squaredDistance);
    }
}
