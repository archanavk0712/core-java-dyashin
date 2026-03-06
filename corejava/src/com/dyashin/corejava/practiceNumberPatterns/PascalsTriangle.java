package com.dyashin.corejava.practiceNumberPatterns;

public class PascalsTriangle 
{
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) 
        {
            for (int j = n-i; j>1; j--) 
            {
                System.out.print(" ");
            }

            // First number in every row is always 1
            int number = 1;

            // Loop through columns (numbers in that row)
            for (int k = 0; k <= i; k++) {

                // Print the current number with a space
                System.out.print(number + " ");

                /*
                 * Formula to get the next number in the row:
                 * C(i, k+1) = C(i, k) * (i - k) / (k + 1)
                 *
                 * Example (Row 4 -> 1 4 6 4 1):
                 * Start: number = 1
                 * Next = 1 * (4-0)/(0+1) = 4
                 * Next = 4 * (4-1)/(1+1) = 6
                 * Next = 6 * (4-2)/(2+1) = 4
                 * Next = 4 * (4-3)/(3+1) = 1
                 */
                number = number * (i - k) / (k + 1);
            }

            // Move to next row
            System.out.println();
        }
    }
}
