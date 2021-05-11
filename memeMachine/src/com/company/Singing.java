package com.company;

import java.util.Scanner;

public class Singing {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        //System.out.println("n");
        int n = Sc.nextInt(); //number of test cases

        for(int i = 0; i < n; i++){
            //System.out.println("case "+n);
            //System.out.println("    t and s");

            int t = Sc.nextInt();
            int s = Sc.nextInt();
            long totalPresses = 0;
            //System.out.println(s);
            //System.out.println("    sequence");

            int currentS;
            int lastS = Sc.nextInt();

            for(int j = 1; j < s; j++){
                currentS = Sc.nextInt();
                totalPresses += findMinPresses(lastS,currentS,t);
                lastS = currentS;
            }

            System.out.println(totalPresses);
        }
    }

    public static int findMinPresses(int start, int end, int length){
        int fwdDist;
        int bckDist;

        if(start < end){
            fwdDist = end - (start+1);
            bckDist = (start+1) + (length - end);
        } else{
            fwdDist = (length - (start+1)) + end;
            bckDist = (start+1) - end;
        }

        //System.out.println("fwd "+fwdDist);
        //System.out.println("bck "+bckDist);

        if(fwdDist < bckDist) return fwdDist;
        else return bckDist;
    }
}
