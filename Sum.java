//2. Take two numbers and print the sum of both.

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = input.nextInt();

        System.out.println("Two numbers are : " + "First number is " + num1 + " and second number is " + num2);
        System.out.println("Sum of two numbers is : " + (num1 + num2));
    }
}
