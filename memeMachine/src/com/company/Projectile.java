package com.company;

import java.util.Scanner;

public class Projectile {
    double angle;
    double velocity;
    double g;
    boolean metric;
    String metricInput;

    public Projectile(double vi,double ai){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Metric? y/n");
        metricInput = Sc.next();
        boolean inputRead = false;
        while(!inputRead) {
            if (metricInput.contentEquals("y")) {
                metric = true;
                System.out.println("Using metric...");
            } else if (metricInput.contentEquals("n")) {
                metric = false;
                System.out.println("Using imperial...");
            } else {
                System.out.println("???");
            }
        }
        if(metric){
            g = 9.81;
        } else{

        }

        angle = ai;
        velocity = vi;
        double vy = velocity*Math.sin(angle);
        double vx = velocity*Math.cos(angle);
        double timeVertex = vy/g;
    }
}
