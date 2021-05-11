package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class STATSSUCKS {
    public static void main(String[] args) {
        int score = 0;
        int tosses = 0;

        while(score < 12){
            if(ThreadLocalRandom.current().nextInt(0,10) >= 4) {
                score += 0;
                tosses++;
            }
            else if (ThreadLocalRandom.current().nextInt(0,10) >= 1){
                score += 1;
                tosses++;
            }
            else {
                score += 3;
                tosses++;
            }
        }
        System.out.println(tosses);
    }
}
