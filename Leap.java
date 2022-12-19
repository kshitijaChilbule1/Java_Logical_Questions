// 1. Input a year and find whether it is a leap year or not.
import java.util.Scanner;
public class Leap{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        int year = in.nextInt();
        System.out.println("year is: " + year);
        if(year % 4 == 0 && year % 400 == 0 || year % 400 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Ordinary year");
        }
    }
}