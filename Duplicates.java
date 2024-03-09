package week7;

import java.util.Scanner;
public class Duplicates
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        boolean hasDuplicates = false;
        int position1 = -1;
        int position2 = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    position1 = i;
                    position2 = j;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("Array contains duplicate elements at positions " + position1 + " and " + position2);
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

        sc.close();
	}
}


    

