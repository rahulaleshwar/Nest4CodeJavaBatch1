/*Write a program which takes one number as input
and print the number of odd and even digits in the
numbers.
▪ Number can be positive or negative both.
▪ You can assume that user will always enter number
as input.*/

import java.util.Scanner;

public class Assignment4 {
	public static void main(String args[])

	{
		// input
		Scanner nobj = new Scanner(System.in);
		System.out.println("enter the number:");
		long nums = nobj.nextLong();

		// converting -ve to +ve
		long answer = Math.abs(nums);
		Check detail = new Check();
		detail.countEvenOdd((long) answer);

	}
}

class Check {

	// counting digits
	long countEvenOdd(Long nums) {
		long even_count = 0;
		long odd_count = 0;
		while (nums > 0) {

			Long rem = nums % 10;
			if (rem % 2 == 0)
				even_count++;

			else
				odd_count++;
			nums = nums / 10;
		}
		System.out.println("Even count : " + even_count);
		System.out.println("Odd count : " + odd_count);

		// checking for even odd
		if (even_count % 2 == 0 && odd_count % 2 != 0)
			return 1;
		else
			return 0;
	}

}
