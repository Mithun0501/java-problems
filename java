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
5. ATM Withdrawal System
    import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000; // example balance
        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        if (balance >= withdraw) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
6.Online Shopping Discount

    import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 2000) {
            discount = amount * 0.10;
        } 

        double finalAmount = amount - discount;
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);

        sc.close();
    }
}
7.Traffic Signal System

    import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Signal Color (Red/Yellow/Green): ");
        String color = sc.next().toLowerCase(); // convert to lowercase for consistency

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Get Ready");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Color");
        }

        sc.close();
    }
}
8.Given two integers M and N, calculate the product of all integers from M and N inclusive .if M is greater than N , return 1 or display an appropriate message

    import java.util.Scanner;

public class ProductOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter M: ");
        int M = sc.nextInt();

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Check if M > N
        if (M > N) {
            System.out.println("1 (Invalid Range: M is greater than N)");
        } else {
            long product = 1; // use long to avoid overflow for large numbers
            for (int i = M; i <= N; i++) {
                product *= i;
            }
            System.out.println("Product = " + product);
        }

        sc.close();
    }
}
9.Given  two integers M and N, calculate the product  of all odd integers from M and N inclusive.if M is greater than N , return 1 or display an appropriate message 

    import java.util.Scanner;

public class ProductOfOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter M: ");
        int M = sc.nextInt();

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Check if M > N
        if (M > N) {
            System.out.println("1 (Invalid Range: M is greater than N)");
        } else {
            long product = 1;
            boolean foundOdd = false;

            for (int i = M; i <= N; i++) {
                if (i % 2 != 0) {  // check if odd
                    product *= i;
                    foundOdd = true;
                }
            }

            if (foundOdd) {
                System.out.println("Product of odd numbers = " + product);
            } else {
                System.out.println("No odd numbers in the given range.");
            }
        }

        sc.close();
    }
}



