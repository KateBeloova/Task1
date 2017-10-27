import Matrices.MultiplyOfMatrices;

public class Main {
    public static void main(String[] args) {
        int[][] mA =
                {{33, 34, 12},
                        {33, 19, 10},
                        {12, 14, 17},
                        {84, 24, 51},
                        {43, 71, 21}};

        int[][] mB =
                {{10, 11, 34, 55},
                        {33, 45, 17, 81},
                        {45, 63, 12, 16}};
       int [][] output = MultiplyOfMatrices.Multiply(mA, mB);
       for(int i = 0; i<output.length; i++){
           for(int k = 0; k<output[0].length;k++){
               System.out.print(output[i][k]+" ");
           }
           System.out.println();
       }
    }
}
