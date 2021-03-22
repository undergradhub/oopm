import java.util.*;
import java.io.*;

class prime_demo {
    public static void main(String args[]){
        int i, a, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        a = sc.nextInt();
        if (a != 1) {
            for (i = 2; i <= a; i++) {
                if (a % i == 0) {
                    c++;
                }
            }
            if (c > 1) {
                System.out.println(a + " is not prime");
            } else {
                System.out.println(a + " is prime");
            }
        } 
        else {
            System.out.println(" 1 is neither Prime nor Composite ");
        }
    }
}