package com.company;

public class Main {

    public static void main(String[] args) {
	    for(int idx = 1; idx <= 1000; idx++) {
	        DisplayArmstrongNumber(idx);
        }
    }

    private static void DisplayArmstrongNumber(int arm) {
        int one = 0, ten = 0, hundret = 0, dividerTen = 10, temp = arm;

        one = arm % dividerTen;
        arm /= dividerTen;
        ten = arm % dividerTen;
        hundret = arm / dividerTen;

        one = one * one * one;
        ten = ten * ten * ten;
        hundret = hundret * hundret * hundret;

        if(temp == (one + ten + hundret)) {
            System.out.println(temp);
        }
    }
}
