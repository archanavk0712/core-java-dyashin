package com.dyashin.corejava.practiceMiscellaneousPatterns;

public class BinaryPattern {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // If (row + column) is even, print 0; else print 1
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}