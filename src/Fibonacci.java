import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int maxNumber;
        System.out.print("How many numbers do you want in Fibonacci: ");
        Scanner sc = new Scanner(System.in);
        maxNumber = sc.nextInt();
        System.out.print("Iteratively Fibonacci Series of " + maxNumber + " numbers is: ");
        iterativelyFibonacci(maxNumber);

        System.out.println();
        System.out.print("Recursively Fibonacci Series of " + maxNumber + " numbers is: ");

        for (int i = 0; i < maxNumber; i++) {
            System.out.print(recursivelyFibonacci(i) + " ");
        }

    }

    public static void iterativelyFibonacci(int n) {
        int previousNumber = 0;
        int nextNumber = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }

    public static int recursivelyFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return recursivelyFibonacci(n - 1) + recursivelyFibonacci(n - 2);
        }
    }

}


