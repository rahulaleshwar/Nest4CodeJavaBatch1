/*Write a program which takes two string as input and exchange the
first two character of one string with last two character of the other
string. Same thing needs to be done for both the string.
Use of loop is not allowed.*/

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner fobj = new Scanner(System.in);
		// input1
		System.out.println("String 1 :");
		String s1 = fobj.nextLine();
		// input2
		System.out.println("String 2 :");
		String s2 = fobj.nextLine();
		
		// length_of_s1
		int length1 = s1.length();
		// length_of_s2
		int length2 = s2.length();
		
		// accessing last two char of s2
		String l2fors2 = s2.substring(length2 - 2, length2);
		// accessing last two char of s1
		String l2fors1 = s1.substring(length1 - 2, length1);
		
		// accessing first two char of s2
		String f2fors2 = s2.substring(0, 2);
		// accessing first two char of s2
		String f2fors1 = s1.substring(0, 2);

		// swapping the char
		String result2 = l2fors2 + s2.substring(2, length2 - 2) + f2fors2;
		String result1 = l2fors1 + s1.substring(2, length1 - 2) + f2fors1;

		// printing result
		System.out.println(result1);
		System.out.println(result2);
	}

}