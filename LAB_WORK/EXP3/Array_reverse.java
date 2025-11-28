/* Write a Java program to read numbers in an integer array of size 5 and display the array in reverse order:
Definition of Done (DoD):
DoD 1: The program should ask the user to enter the elements of the array.
DoD 2: The program should display the reversed array.
 */
import java.util.*;
public class Array_reverse {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Reversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}