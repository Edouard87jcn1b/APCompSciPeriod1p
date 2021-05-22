package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class STATSSUCKS {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int total = 0;
        int number;
        int winners = 0;

        for (int j = 0; j < 10; j++) {
            while (total <= 400) {
                number = Sc.nextInt();

                if (number == 9) total += 200;
                else if (number == 8) total += 100;
                else if (number > 5) total += 50;
                else total += 20;

                winners++;
            }
            total = 0;
        }
        System.out.println((double) winners / 10.0);
    }

}

