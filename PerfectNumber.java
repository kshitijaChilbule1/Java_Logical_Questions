
//Perfect Number In Java

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;

        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == temp){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
