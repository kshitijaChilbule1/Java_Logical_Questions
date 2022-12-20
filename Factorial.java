//Factorial Program In Java

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        for(int i=num; i>0; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
