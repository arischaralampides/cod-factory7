package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLeap = false;
        int year = 0;

        System.out.println("Please insert year");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 !=0 || year %  400 == 0);

        System.out.println(" year: " + year + " is leap: " + isLeap);

    }
}
