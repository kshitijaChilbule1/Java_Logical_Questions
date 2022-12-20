// 9. Find occurence of a digit in a number

import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        int n = 820907;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 0) {
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
