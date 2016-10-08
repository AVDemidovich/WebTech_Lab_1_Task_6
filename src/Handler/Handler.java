package Handler;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */
public class Handler {
    public static double[][] makeMatrix(double[] numbers){
        if (numbers == null) return  null;
        double[][] Matrix;
        int z = 0;
        Matrix = new double[numbers.length][numbers.length];
        for (int i = 0; i <= numbers.length - 1; i++)
            for (int j = 0; j <= numbers.length - 1; j++) {
                Matrix[i][j] = numbers[z];
                z++;
                if (z == numbers.length){
                    z = 0;
                }
                if (j == numbers.length - 1){
                    z = i + 1;
                }
            }
        return Matrix;
    }
}
