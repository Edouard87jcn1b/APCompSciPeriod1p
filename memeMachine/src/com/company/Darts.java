package com.company;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        for(int i = 0; i < n; i++){
            int w = Sc.nextInt();
            int b = Sc.nextInt();
            int d = Sc.nextInt();
            int s = Sc.nextInt();

            double width = 2*Math.PI/w;

            int t = Sc.nextInt();
            int score = 0;

            for(int j = 0; j  < t; j++){
                double x = Sc.nextFloat();
                double y = Sc.nextFloat();

                double theta = Math.atan2(y,x);
                double r = Math.sqrt((x*x)+(y*y));
                if(theta < 0) theta = (2*Math.PI) + theta;

                int zone = ((int) (theta/width))+1;
                //System.out.println(zone);
                //System.out.println(width);
                //System.out.println(theta);

                if(r < b) score += 50;
                else if (r < d) score += 2*zone;
                else if(r < s) score += zone;
                //System.out.println(score);
            }
            System.out.println(score);
        }
    }
}
