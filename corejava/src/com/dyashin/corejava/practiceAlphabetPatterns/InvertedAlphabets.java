package com.dyashin.corejava.practiceAlphabetPatterns;

public class InvertedAlphabets {
    public static void main(String[] args) {
        int n = 5;  // number of letters in the first row
        for (int i = 0; i < n; i++) {           // controls rows
            for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {   // controls letters in row
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}