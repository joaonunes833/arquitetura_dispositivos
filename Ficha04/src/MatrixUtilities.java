public class MatrixUtilities {
    public static String show(int[][] matrix){
        String strMatrix = "[\n";
        for (int i = 0; i < matrix.length;i++){
            strMatrix += '[';
            for (int j = 0; j < matrix[i].length; j++){
                if (j == matrix[i].length - 1){
                    strMatrix += Integer.toString(matrix[i][j]);
                }
                else {
                    strMatrix += Integer.toString(matrix[i][j]) + ',';
                }
            }
            if (i == matrix.length-1){
                strMatrix += "]\n";
            }
            else {
                strMatrix += "],\n";
            }
        }
        strMatrix += ']';

        return strMatrix;
    }
    public static boolean isMatrix(int [][] matrix){
        boolean isMatrix = true;
        String matrixCheck = "";
        int index0 = matrix[0].length;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i].length == index0){
                matrixCheck += '1';
            }
            else {
                matrixCheck += '0';
            }
        }
        for (int i = 0; i < matrixCheck.length(); i++){
            if (matrixCheck.charAt(i) == '0'){
                isMatrix = false;
            }
        }
        return isMatrix;
    }

    /*public static boolean isIdentity(int [][] matrix){
        boolean isIdentity = false;
        if (matrix.length == matrix[0].length){
            if (isMatrix(matrix) == true){
                isIdentity = true;
            }
            else {
                isIdentity = false;                    // Código não correspondente com exercicio proposto.
            }
        }
        else {
            isIdentity = false;
        }
        return isIdentity;
    }*/

    public static boolean isIdentity(int[][] matrix){
        boolean isIdentity = false;
        int currentOne = 0;
        String identityCheck = "";
        if (isMatrix(matrix)==true){
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    if (matrix[i][j] == 1 && matrix[i][j] == matrix[i][currentOne]){
                        identityCheck += '1';
                    }
                }
                currentOne++;
            }
            if (identityCheck.length() == matrix.length){
                isIdentity = true;
            }
        }
        return isIdentity;
    }

    public static int[][] multiplyBy(int[][] matrix, int constant){
        int[][] result = matrix;
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = result[i][j] * constant;
            }
        }
        return result;
    }

    public static boolean compatibleForSum(int[][] matrix1, int[][] matrix2){
        boolean canSum = false;
        String sumCheck = "";
        if(matrix1.length == matrix2.length){
            for (int i = 0; i < matrix1.length;i++){
                if(matrix1[i].length == matrix2[i].length){
                    sumCheck += '1';
                }
            }
            if (sumCheck.length() == matrix1.length){
                canSum = true;
            }
        }
        return canSum;
    }

    public static int[][] sumOf(int[][] matrix1, int[][] matrix2){
        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
        if (compatibleForSum(matrix1,matrix2) == true){
            for (int i = 0; i < matrixSum.length; i++){
                for(int j = 0; j < matrixSum[i].length; j++){
                    matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        else{
            System.out.println("Can't sum both matrix's");
        }
        return matrixSum;
    }
}
