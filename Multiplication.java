//3. Take a number as input and print the multiplication table for it.

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Number is "+ num);
        for(int i=1; i<=10; i++){
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
