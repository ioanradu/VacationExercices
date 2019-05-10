import java.util.Scanner;

public class MyMathematicalOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String str = sc.nextLine();
        String[] sir = str.split(" ");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());

        //se poate implementa si cu switch
        if (str.contains("+")) {
            System.out.println("output : " + add(a, b));

        } else if (str.contains("-")) {
            System.out.println("output : " + substract(a, b));

        } else if (str.contains("*")) {
            System.out.println("output : " + multiply(a, b));

        } else if (str.contains("/")) {
            System.out.println("output : " + divide(a, b));

        } else if (str.contains("%")) {
            System.out.println("output : " + modulo(a, b));

        } else {
            System.out.println("Please enter a valid operation!");
        }
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int substract(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public static int modulo(int a, int b) {
        int result = a % b;
        return result;
    }

}