package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean first = (y>x);
		boolean second = (z>y);
		boolean third = (x>y);
		boolean fourth = (y>z);
		boolean isOrdered = (first && second) || (third && fourth);
		System.out.println(isOrdered);
	}

}
