import java.util.Scanner;

public class MyMathematicalOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String str = sc.nextLine();

        //se poate implementa si cu switch
        if (str.contains("+")) {
            add(str);
        } else if (str.contains("-")) {
            substract(str);
        } else if (str.contains("*")) {
            multiply(str);
        } else if (str.contains("/")) {
            divide(str);
        } else if (str.contains("%")) {
            modulo(str);
        } else {
            System.out.println("Please enter a valid operation!");
        }
    }

    public static void add(String str) {
        String[] sir = str.split("\\+");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());
        int result = a + b;
        System.out.println("output : " + result);
    }

    public static void substract(String str) {
        String[] sir = str.split("\\-");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());
        int result = a - b;
        System.out.println("output : " + result);
    }

    public static void multiply(String str) {
        String[] sir = str.split("\\*");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());
        int result = a * b;
        System.out.println("output : " + result);
    }

    public static void divide(String str) {
        String[] sir = str.split("\\/");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());
        int result = a / b;
        System.out.println("output : " + result);
    }

    public static void modulo(String str) {
        String[] sir = str.split("\\%");
        int a = Integer.parseInt(sir[0].trim());
        int b = Integer.parseInt(sir[sir.length - 1].trim());
        int result = a % b;
        System.out.println("output : " + result);
    }

}