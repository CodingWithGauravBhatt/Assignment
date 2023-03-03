package Today3Mar;

import java.util.Scanner;

public class AverageofArr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    
    int[] array = new int[size];
    System.out.println("Enter the elements of the array: ");
    
    // loop through the array and get user input for each element
    for (int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
    }
    
    // calculate the sum of the array elements
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += array[i];
    }
    
    // calculate the average of the array elements
    double average = (double) sum / size;
    
    System.out.println("Average of the array elements: " + average);
}
}