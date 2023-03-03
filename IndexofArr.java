package Today3Mar;

import java.util.Scanner;

public class IndexofArr {
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
    
    System.out.print("Enter the search key: ");
    int key = sc.nextInt();
    
    // loop through the array to find the index of the search key
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (array[i] == key) {
            index = i;
            break;
        }
    }
    
    if (index != -1) {
        System.out.println("Index of the first occurrence of " + key + " is: " + index);
    } else {
        System.out.println(key + " not found in the array.");
    }

}
}