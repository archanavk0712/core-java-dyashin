package com.dyashin.corejava.practiceAlphabetPatterns;

public class AlphabetPyramid 
{
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) 
        {
            for (int j = n-i; j>1; j--) 
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            
            //(char)65=A
            //(char)66=B
            //(char)67=C

            // print descending characters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            // Move to next row
            System.out.println();
        }
    }
}
