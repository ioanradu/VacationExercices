public class ShowMatrixMirrors {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4, 5}, {12, 7, 1, 2}, {23, 45, 5, 78}, {24, 34, 65, 9}};

        showArray(matrix);

        System.out.println("Mirror vertically: ");
        int[][] vertically = mirrorVertically(matrix);
        showArray(vertically);

        System.out.println("Mirror horrizontally: ");
        int[][] horrizontally = mirrorHorrizontally(matrix);
        showArray(horrizontally);

        System.out.println("Mirror both way: ");
        int[][] bothWay = mirrorBothWays(matrix);
        showArray(bothWay);

    }

    public static void showArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf(" %3d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] mirrorVertically(int[][] m) {
        int[][] mirrorImage = new int[4][4];
        int imageRows = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = 0; j < m.length; j++) {
                mirrorImage[imageRows][j] = m[i][j];
            }
            imageRows++;
        }
        return mirrorImage;
    }

    public static int[][] mirrorHorrizontally(int[][] m) {
        int[][] mirrorImage = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            int imageColumn = 0;
            for (int j = m.length - 1; j >= 0; j--) {
                mirrorImage[i][imageColumn] = m[i][j];
                imageColumn++;

            }
        }
        return mirrorImage;
    }

    public static int[][] mirrorBothWays(int[][] m) {
        int[][] mirrorImage = new int[4][4];
        int imageRows = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            int imageColumn = 0;
            for (int j = m.length - 1; j >= 0; j--) {
                mirrorImage[imageRows][imageColumn] = m[i][j];
                imageColumn++;
            }
            imageRows++;
        }
        return mirrorImage;
    }
}
