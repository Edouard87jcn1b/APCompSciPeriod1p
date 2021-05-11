package com.company;

import java.util.Scanner;

public class Projectile {
    double dx;
    double dy;
    double angle;
    double vi;
    double t;

    boolean findDx = false;
    boolean findDy = false;
    boolean findAngle = false;
    boolean findVi = false;
    boolean findT = false;

    double g;
    boolean metric;
    Scanner Sc = new Scanner(System.in);

    double vy = vi*Math.sin(angle);
    double vx = vi*Math.cos(angle);
    double timeVertex = vy/g;

    public void setUnits(){

        System.out.println("Metric? y/n");
        String metricInput = Sc.next();
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
            g = 9.81; //m*s^-2
        } else{
            g = 32.2; //ft*s^-2
        }
    }

    public void defineVar(){
        int vars = 0;
        while(vars < 3){
            System.out.println("Set variables (1 = dx, 2 = dy, 3 = angle, 4 = vi, 5 = t");
            int varChoice = Sc.nextInt();
            System.out.println("Input value for ");

            switch(varChoice){
                case 1: System.out.print("dx");

            }
        }



        System.out.println("Metric? y/n");
        String metricInput = Sc.next();
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
    }


}
