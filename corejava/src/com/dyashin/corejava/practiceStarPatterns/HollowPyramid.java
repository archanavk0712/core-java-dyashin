package com.dyashin.corejava.practiceStarPatterns;

public class HollowPyramid 
{
	public void pyramid1()
	{
		int n = 5; // height of the pyramid

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int k = 0; k <= i; k++) {
                // Print star if it's the first or last in the row,
                // or if it's the last row
                if (k == 0 || k == i || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // 2 spaces for hollow effect
                }
            }

            System.out.println();
        }
    }
	
	public void pyramid2()
	{
		int n = 4; // height of pyramid

        for (int i = 0; i < n; i++) {
            // Loop over total columns (2*n - 1)
            for (int j = 0; j < 7; j++) {
                // Conditions:
                // Left boundary = n - 1 - i
                // Right boundary = n - 1 + i
                // Last row = n - 1
                if (j == (n - 1 - i) || j == (n - 1 + i) || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
    public static void main(String[] args) 
    {
    	HollowPyramid a=new HollowPyramid();
    	a.pyramid1();
    	a.pyramid2();
    }
        
}

