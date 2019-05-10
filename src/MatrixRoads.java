import java.util.Scanner;

public class MatrixRoads {

    public static void main(String[] args) {
        Road[][] roadMatrix = new Road[5][5];

        roadMatrix[3][0] = new Road(2.5, 1.2);
        roadMatrix[1][3] = new Road(4.5, 1.7);
        roadMatrix[3][4] = new Road(2.7, 7.2);
        roadMatrix[1][2] = new Road(9.3, 5.2);
        roadMatrix[4][2] = new Road(12.1, 8.2);
        roadMatrix[0][1] = new Road(1.1, 3.1);
        roadMatrix[4][3] = new Road(6.3, 3.2);
        roadMatrix[4][1] = new Road(10.0, 9.2);
        roadMatrix[0][2] = new Road(3.9, 4.7);

        showRoads(roadMatrix);

        boolean equal = false;

        while (!equal) {
            int[] indecesArray = newIndeces();
            int line = indecesArray[0];
            int col = indecesArray[1];

            if (line == col) {
                System.out.println("Indeces are invalid, they don't need to have the same values, please enter new indeces");
            } else {
                boolean findIndecesValue = false;
                for (int i = 0; i < roadMatrix.length; i++) {
                    for (int j = 0; j < roadMatrix[i].length; j++) {

                        if (roadMatrix[line][col] == null) {
                            findIndecesValue = true;
                        } else if (roadMatrix[i][j] == roadMatrix[line][col]) {
                            System.out.println(roadMatrix[i][j].distance + " - " + roadMatrix[i][j].duration);
                            showRoads(roadMatrix);
                            equal = true;
                        }
                    }
                }
                if (findIndecesValue == true) {
                    System.out.println("The road doesn't exist, need to creat a new one, please enter a value for distance and a value for duration ");
                    Scanner sc = new Scanner(System.in);
                    String search = sc.nextLine();
                    String[] myString = search.split("-");
                    double distance = Double.valueOf(myString[0]);
                    double duration = Double.valueOf(myString[1]);

                    addANewRoad(roadMatrix, line, col, distance, duration);
                    showRoads(roadMatrix);
                    equal = true;
                }

            }
        }
        System.out.println();
        showCityRoads(roadMatrix);

    }

    public static int[] newIndeces() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 indices : ");
        System.out.println();
        String search = sc.nextLine();
        String[] myString = search.split("-");
        int line = Integer.valueOf(myString[0]);
        int col = Integer.valueOf(myString[1]);
        int[] indecesArray = {line, col};
        return indecesArray;
    }

    public static void showRoads(Road[][] roadMatrix) {
        for (int i = 0; i < roadMatrix.length; i++) {
            for (int j = 0; j < roadMatrix[i].length; j++) {
                if (roadMatrix[i][j] != null) {
                    System.out.println(roadMatrix[i][j].distance + " - " + roadMatrix[i][j].duration);
                }

            }
        }
    }

    public static void addANewRoad(Road[][] roadMatrix, int line, int col, double distance, double duration) {
        roadMatrix[line][col] = new Road(distance, duration);
    }

    public static void showCityRoads(Road[][] roadMatrix) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a city number from 0 to 4 to find roads with other cities if they are exist: ");
        int searchCity = sc.nextInt();
        System.out.println("The cities that have roads with " + searchCity + " are: ");
        for (int j = 0; j < roadMatrix.length; j++) {
            if (roadMatrix[searchCity][j] != null) {
                System.out.println(roadMatrix[searchCity][j].distance + " - " + roadMatrix[searchCity][j].duration);
            }
        }
    }
}