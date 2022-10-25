public class Main {





    public static void main(String[] args) {
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD","WEB-FE","WEB-BE"};
        final int[][] studentGrades = {
                {15,18,17}, // 20032
                {18,10,11}, // 30312
                {11,13,15}, // 25342
                {10,19,16}  // 31432
        };
        float highestAvg = 0;
        int highestAvgStudent = 0;
        for (int i = 0; i < studentNumbers.length;i++){
            System.out.println("Aluno " + studentNumbers[i] + " obteve as seguintes avaliações:");
            float avg = 0;
            for (int j = 0; j < courseAcronyms.length; j++){
                System.out.println("\t" + courseAcronyms[j] + ": " + studentGrades[i][j]);
                avg += studentGrades[i][j];
            }
            avg = avg / 3;
            System.out.println("\tMédia: " + avg);
            if (avg > highestAvg){
                highestAvg = avg;
                highestAvgStudent = studentNumbers[i];
            }
        }
        System.out.println("Média maior: " + highestAvg);
        System.out.println("Aluno: " + highestAvgStudent);
    }
}
