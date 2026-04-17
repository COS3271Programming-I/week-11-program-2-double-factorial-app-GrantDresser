// Double Factorial App
// Grant Dresser
// 4/17/2026

import java.util.Scanner;

public class DoubleFactorialApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("    DOUBLE FACTORIAL APP    ");

        // error trapping
        while (true)
        {
            System.out.print("Enter a positive integer less than 20: ");

            if (input.hasNextInt())
            {
                num = input.nextInt();

                if (num > 0 && num < 20)
                {
                    break;
                }
                else
                {
                    System.out.println("Number must be between 1 and 19.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear bad input
            }
        }

        int result = doubleFactorial(num);

        System.out.println(num + "!! = " + result);
    }

    // recursive method
    public static int doubleFactorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }
}