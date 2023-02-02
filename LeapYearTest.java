package ControlStatement;

import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args){
	      int a;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      a = sc.nextInt();

	      if (a % 4 == 0) 
	         System.out.println("This is a leap year");
	      else
	         System.out.println("This is not a leap year");
	   }
	
	
}

