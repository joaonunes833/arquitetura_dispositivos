public class CharacterUtilities {
    public static char lowerLetterSucessorOf(char letter){
        char nextLetter = letter;
        if(Character.isLowerCase(letter)) {
            nextLetter++;
            return nextLetter;
        }
        else {
            System.out.println("The character is not lowercase.");
        }
        return nextLetter;
    }
    public static char lowerLetterPredecessorOf(char letter){
        char nextLetter = letter;
        if(Character.isLowerCase(letter)) {
            nextLetter--;
        }
        else {
            System.out.println("The character is not lowercase.");
        }
        return nextLetter;
    }
    public static char lowerLetterSuccessorStepsOf(char letter, int steps){
        char requestedLetter = letter;
        if(Character.isLowerCase(letter)) {
            requestedLetter+= steps;
        }
        else {
            System.out.println("The character is not lowercase.");
        }
        return requestedLetter;
    }
    public static char lowerLetterPredecessorStepsOf(char letter, int steps){
        char requestedLetter = letter;
        if(Character.isLowerCase(letter)) {
            requestedLetter -= steps;
        }
        else {
            System.out.println("The character is not lowercase.");
        }
        return requestedLetter;
    }
    public static int occurrencesOfCharacterIn(char[] array, char letter){
        int occurrencesCount = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == letter){
                occurrencesCount++;
            }
        }
        if (occurrencesCount == 0){
            System.out.println("Letter not present in array");
        }
        return occurrencesCount;
    }
    public static char[] replaceCharacterIn(char[] array, char letterIn, char replace){
        boolean letterPresence = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == letterIn){
                letterPresence = true;
                array[i] = replace;
            }
        }
        if (letterPresence == false) {
            System.out.println("Letter not present in array");
        }
        return array;
    }
    /*public static char[] concatenationOf(char[] arrayA, char[] arrayB){
        char[] concatArray = new char[arrayA.length + arrayB.length];
        System.arraycopy(arrayA, 0, concatArray, 0, arrayA.length);
        System.arraycopy(arrayB, 0, concatArray, arrayA.length, arrayB.length);
        return concatArray;
    }*/
    public static char[] concatenationOf(char[] arrayA, char[] arrayB){
        char[] concatArray = new char[arrayA.length + arrayB.length];
        int o = 0;
        for (int i = 0; i < arrayA.length;i++){
            concatArray[o] = arrayA[i];
            o++;
        }
        for (int i = 0; i < arrayB.length;i++){
            concatArray[o] = arrayB[i];
            o++;
        }
        return concatArray;
    }
    public static char[] copyOfPartOf(char[] array, int indexStart, int indexEnd){
        char[] result = new char[indexEnd - indexStart + 1];
        int o = 0;
        for (int i = indexStart; i <= indexEnd; i++){
            result[o] = array[i];
            o++;
        }
        return result;
    }
}
