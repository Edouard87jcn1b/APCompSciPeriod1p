package com.company;

import java.util.Scanner;

public class WEWLAD {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("gib meme");
        String meme = Sc.nextLine();
        meme = meme.toUpperCase();
        meme = meme.replaceAll("\\s","");
        int length = meme.length();

        //first line
        for(int i = 0; i < length; i++){
            System.out.print(meme.charAt(i));
            if((i+1) < length){
                System.out.print("  ");
            }
        }
        //all the other lines
        for(int j = 1; j < length; j++){
            //first character
            System.out.println();
            System.out.print(meme.charAt(j)+"  ");
            //spaces until next character
            for(int k = 2; k <= j; k++){
                System.out.print("   ");
            }
            //next character
            System.out.print(meme.charAt(j));
        }
    }
}
