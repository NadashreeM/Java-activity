package week5;

import java.util.Scanner;
public class palindromeExample 
{
	public static void main(String[] args) {
		int num, rev=0, rem;
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=inScanner.nextInt();
		int temp=num;
		while (num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if (temp==rev) {
			System.out.println(temp+"\t is a palindrome number");
		}
		else
			System.out.println(temp+"\t is not a palindrome number");

	}
}
