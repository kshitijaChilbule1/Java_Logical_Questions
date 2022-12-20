//Subtract the Product and Sum of Digits of an Integer
public class Difference {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int product = 1;
        while(num > 0){
            int rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(product);
        System.out.println(sum);
        System.out.println("Difference between product and sum of digits of an integer is : " + (product - sum));
    }
}
