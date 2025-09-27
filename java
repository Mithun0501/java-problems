1. Add two numbers, store in a third variable, and print it
public class AddNumbers {
    public static void main(String[] args) {
        int num1 = 10;  // first number
        int num2 = 20;  // second number

        int sum = num1 + num2;  // store result in third variable

        System.out.println("The sum is: " + sum);
    }
}
2. Check if a number is even or odd

public class EvenOddCheck {
    public static void main(String[] args) {
        int num = 15;  // you can change this number

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
3. Find the largest of two numbers using if-else

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Using if-else
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
4. . Check if a person is eligible to vote
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Checking eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
