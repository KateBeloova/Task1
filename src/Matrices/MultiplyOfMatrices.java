package Matrices;

public class MultiplyOfMatrices {
    public static int [][] Multiply(int [][] matrice1, int [][] matrice2){
        int [][] result = new int [matrice1.length][matrice2[0].length];
        for(int n = 0; n<matrice1.length; n++){
            for(int i = 0; i<matrice2[0].length; i++){
                for(int j = 0; j<matrice2.length; j++) {
                    result[n][i] += matrice1[n][j] * matrice2[j][i];
                }
            }
        }
        return result;
    }
}
