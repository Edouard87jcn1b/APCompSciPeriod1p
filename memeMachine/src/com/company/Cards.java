package com.company;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();

        for (int i = 0; i < t; i++) {


            int c = Sc.nextInt();
            int discards = 0;
            int totalCost = 0;
            int[] stack = new int[c];
            for (int j = 0; j < c; j++) {
                stack[j] = Sc.nextInt();
            }

            for (int target = 1; target <= c; target++) {
                int pos = findCard(stack, target);
                int fwdCost = 0;
                int bwdCost = 0;

                for (int j = 0; j < pos; j++) fwdCost += stack[j];
                for (int j = stack.length - 1; j >= pos; j--) bwdCost += stack[j];
                if (fwdCost < bwdCost) {
                    stack = topToBottom(stack, pos);
                    totalCost += fwdCost;
                } else{
                    stack = bottomToTop(stack, stack.length-pos);
                    totalCost += bwdCost;
                }
                stack[0] = 0;
            }
            System.out.println(totalCost);

        }

    }

    public static int[] bottomToTop(int[] stack, int moves) {
        for (int j = 0; j < moves; j++) {
            int bot = stack[stack.length - 1];
            for (int i = stack.length - 1; i > 0; i--) {
                stack[i] = stack[i - 1];
            }
            stack[0] = bot;
        }
        return stack;
    }

    public static int[] topToBottom(int[] stack, int moves) {
        for (int j = 0; j < moves; j++) {
            int top = stack[0];
            for (int i = 0; i < stack.length - 1; i++) {
                stack[i] = stack[i + 1];
            }
            stack[stack.length - 1] = top;
        }
        return stack;
    }

    public static int findCard(int[] stack, int target) {
        int pos = -1;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == target) {
                pos = i;
                i = stack.length;
            }
        }
        return pos;
    }
}
