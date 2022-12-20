//To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rem;
        }
        if(reverse == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
