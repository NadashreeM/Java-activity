package week5;

import java.util.Scanner;
public class Sum_of_negativeNo 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		System.out.println("Enetr array elements: ");
		int arr[]=new int[n];
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int sum1=0;
		for (int i=0; i<n; i++) {
			if (arr[i]<0)
				sum1+=arr[i];
		}
		System.out.println("The sum of negative numbers= "+sum1);
		sc.close();
	}

}

