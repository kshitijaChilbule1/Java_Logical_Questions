//Calculate Average Of N Numbers

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int n;
        int count = 1;
        int num;
        int sum = 0;
        float avg = 0;
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter the value of n");  
        n = sc.nextInt();  
        while(count <= n){
            num = sc.nextInt();
            sum = sum + num;
            count ++;
        }
        avg = sum / n;
        System.out.println(avg);
    }
}

