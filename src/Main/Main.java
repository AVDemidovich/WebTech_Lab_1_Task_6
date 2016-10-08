package Main;

import Handler.Handler;

public class Main {

    public static void main(String[] args) {
        double[] numbersForMatrix ={1,2,3,4,5,6,7,8,9,0};
        double[][] matrix;
        matrix = Handler.makeMatrix(numbersForMatrix);
        for (int i = 0; i <= numbersForMatrix.length - 1; i++){
            System.out.println("\t");
            for (int j = 0; j <= numbersForMatrix.length - 1; j++)
                System.out.print(matrix[i][j] + "\t");
        }
    }
}
