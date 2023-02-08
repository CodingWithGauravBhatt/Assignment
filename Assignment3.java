package Class;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter The First Number");
double n1 = in.nextDouble();
System.out.println("Enter The Second Number");
double n2 = in.nextDouble();
System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}