//6 Java Program to Find Largest Among 3 Numbers

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();

        System.out.println("Enter third number : ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is largest number among : " + "\nFirst number : "+ num1 + "\nSecond number : "+ num2 + "\nThird number : "+ num3);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is largest number among : " + "\nFirst number : "+ num1 + "\nSecond number : "+ num2 + "\nThird number : "+ num3);
        }
        else{
            System.out.println(num3 + " is largest number among : " + "\nFirst number : "+ num1 + "\nSecond number : "+ num2 + "\nThird number : "+ num3);
        }
    }
}
