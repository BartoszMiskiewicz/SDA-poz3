package PierwszeZadanie;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by bartosz on 12.04.2017.
 */
public class Seven {

    public static void main(String[] args) {


//       int[][] matrix = saveToMatrixExample();
//       int [] array = {1,4,5,6,3};
//       int[][] matrix1 = {{1,2,3,4,5,6},
//                           {2,3,4,5,6,7},
//                             {6,7,4,3,2,5}};
//
//       printMatrix(matrix);
//       printMatrix(matrix1);
//       printMatrix(fillWithRandomNumbers(4,5));
//        System.out.println();
//       printMatrix(fillWithRandomNumbers(3,4));
//        System.out.println();
//       printMatrix(fillWithRandomNumbers(6,6));
//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert number of rows: ");
//        int rows = scanner.nextInt();
//        System.out.println("Insert number of columns: ");
//        int columns = scanner.nextInt();
//        int[][] matrix = fillWithNumbersFromUser(rows, columns);
//        printMatrix(matrix);
//        int[][] matrix1 = fillWithRandomNumbers(3,3);
//        int[][] matrix2 = fillWithRandomNumbers(3,3);
//        printMatrix(addTwoArrays(matrix1,matrix2));
        int[][] matrix = {{1, 2, 3}, {3, 2, 1}, {2, 3, 1}};
//        printMatrix(multiplyBy(matrix, 3));
        System.out.println(sumOfElements(matrix));


    }

    //(-15 : 15)
    public static int[][] fillWithRandomNumbers(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(30) - 15;
            }

        }
        return matrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
//        rows ->matrix1.lenght;
        // columns -> matrix1[0].length
        //nowa maciez
        //dodajemy kolejne elementy do nowej macierzy
        //zwracamy nowa macierz
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
//        for (int i = 0 ; i< matrix1.length; i++){ // skrot fori to skrot na petle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    //mnozymy kazdy element macierzy przez value. Zwracamy NOWA macierz
    public static int[][] multiplyBy(int[][] matrix, int value) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix[i][j] * value;

            }
        }
        return resultMatrix;
    }

    //Suma wszystkich elemtow w mcierzy
    //czy mozemyuzyc jakiejs gotowej metody? Five.sum
    public static int sumOfElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                sum +=matrix[i][j];
            sum += Five.sum(matrix[i]);
        }
        return sum;
    }

    //zwracamy index wiersza ktory ma najwieksz sume elementow w wierszu
    //czy mozemy uzyc jakiejs gotowej metody?
    public static int indexOfHighestSum(int[][] matrix) {
        int indexOfHighestRow = 0;
//        int sum = Five.sum(matrix[0]);
//        int index = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (Five.sum(matrix[indexOfHighestRow]) < Five.sum(matrix[i])) {
                indexOfHighestRow = i;
            }

        }
        return indexOfHighestRow;

    }

    public static int[][] fillWithNumbersFromUser(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Numbers[" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }

        }
        return matrix;
    }

    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        //save
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;//save
            }
        }
        return matrix;
        //read

    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);//read \t znak tabulacji \t\\ back slash
                if (j != columns - 1)
                    System.out.print(", ");
            }
            System.out.println("|");
        }

    }
}













//    public static int[][] multipleBy(int[][] matrix, int value){
//        return null;
//    }










