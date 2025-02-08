package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0 ;
        Scanner in = new Scanner(System.in);

        System.out.println("δώστε έναν διψήφιο ακέραιο");
        num1 = in.nextInt();
        num2 = num1/10;
        num3 = num2%10;
        sum = num2 + num3;

        System.out.println(sum);

    }
}
