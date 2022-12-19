// 4. Java Program to Swap Two Numbers

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        int a = sc.nextInt();

        System.out.println("Second number : ");
        int b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("First number is : " + a + " and Second number is : " + b);
       
    }
}
