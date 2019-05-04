import java.util.Scanner;

public class GetNumberOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            int numberOfDigits = getNumberOfDigits(number);
            System.out.println("output: " + numberOfDigits);
            System.out.print("Input: ");
        }
    }

    public static int getNumberOfDigits(int number) {
        String sir = Integer.toString(number);
        int numberLength = sir.length();
        return numberLength;
    }
}
