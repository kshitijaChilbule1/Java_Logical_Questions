//Find Lcm of two numbers in java
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
        for(int i = 1; i <= a && i <= b; ++i) {
            if(a % i == 0 && b % i == 0)  {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;  
        System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  
    }
}
