import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int sizeMaxLength = getNumberOfDigits(size);
        timeTableNumbers(sizeMaxLength, size);
    }

    public static int getNumberOfDigits(int number) {
        int maxNumber = number * number;
        String sir = Integer.toString(maxNumber);
        int numberLength = sir.length();
        return numberLength;
    }

    public static void timeTableNumbers(int sizeMaxLength, int size) {
        // formatam outputul intr-o forma optima de vizualizare a numerelor
        String formatOutput = "%" + (int) (sizeMaxLength + 2) + "d";

        System.out.print(" * |");
        for (int i = 1; i <= size; i++) {
            System.out.printf(formatOutput, i);
        }
        System.out.println();

        for (int k = 1; k < (size + 1) * (sizeMaxLength + 2); k++) {
            System.out.print("-");
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d", i);
            System.out.print(" |");
            for (int j = 1; j <= size; j++) {
                System.out.printf(formatOutput, i * j);
            }
            System.out.println();
        }

    }

}
