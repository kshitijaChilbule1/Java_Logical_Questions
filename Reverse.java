//Find reverse of a number

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int reverse = 0;
        int rem = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        while(num > 0){
            rem = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}


