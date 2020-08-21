/*▪ Write a program which takes number as input and
print the half diamond pattern split done vertically.
▪ Refer I/O for sample cases*/

import java.util.Scanner;

public class Assignment5 {
	public static void main(String args[])

	{
		//input
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number:");
		int numofstars = sobj.nextInt();
		
		//star_for_pattern
		String star = "*";
		
		//loop_for_the_1st_pattern
		for (int i = 1; i <= numofstars; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();

		}
		//loop_for_the_2nd_pattern
		for (int i = numofstars - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);

			}
			System.out.println();

		}

	}
}
