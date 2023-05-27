package java.awesome;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
//		// To print 19 number mutliplication
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number from starting");
//		int number = sc.nextInt();
//		System.out.println("Multiplication Table of " + number);
//		
//		for(int i =1;i<=10;i++) {
//			
//			
//		}
//		System.out.println(number +" * " + number + " = " + (number*number) );
//	}
	Scanner sc = new Scanner(System.in);
    int num;
    
    System.out.print("Enter any positive integer: ");
    num = sc.nextInt();
            
    System.out.println("Multiplication Table of " + num);
    
    for(int i=1; i<=10; i++)
    {
        System.out.println(num +" x " + i + " = " + (num*i) );
    }
}
}
