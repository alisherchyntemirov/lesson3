package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {4.5, 7.7, -4.6, 6.5, -5.7, -5.5, 7.6, 8.8, -3.4, 4.5, 7.7, -6.0, 8.6, -3.2, 5.5,};
        double col = 0.0;
        int s = 0;
        boolean f = false;

        for (double sum : numbers) {
            if (sum < 0) {
                f = true;
            } else if (f) {
                col = col + sum;
                s++;

            }

        }
        double i = col / s;
        System.out.println(i);
        System.out.println(i - numbers[0] );
        System.out.println(i-numbers[1]);

    }
}
