package com.dyashin.corejava.practiceMiscellaneousPatterns;

public class CheckerboardPattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        for (int i = 0; i <rows; i++) {
        	if (i % 2!= 0) {
        		System.out.print(" ");
        	}
            for (int j = 0; j <cols; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}