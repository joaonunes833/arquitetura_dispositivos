public class ArrayUtilities {
    public static String toString(int[] array){
        String result = "[";
        for (int i = 0; i < array.length;i++){
            if (i == array.length - 1){
                result = result + array[i] + "]";
            }
            else{
                result = result + array[i] + ",";
            }
        }
        return result;
    }

    public static int maximumOf(int[] array){
        int maxNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
    public static int minimumOf(int[] array){
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minNumber){
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static int[] copyOf(int[] array){
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static boolean contains(int[] array, int number){
        boolean contains = false;
        for (int i = 0; i < array.length;i++){
            if(array[i] == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static boolean containsDuplicates(int[] array){
        int[] duplicateArray = new int[array.length];
        boolean contains = false;
        for (int i = 0; i < array.length; i++){
            duplicateArray[i] = array[i];
            for (int o = 0; o < i; o++) {
                if (duplicateArray[o] == array[i]){
                    contains = true;
                    break;
                }
            }
        }
        return contains;
    }

    public static String indexOf(int[] array, int number){
        String indexOf = "";
        for (int i = 0; i < array.length;i++){
            if (array[i] == number){
                if (indexOf.length() == 0){
                    indexOf += i;
                }
                else {
                    indexOf = indexOf + "," + i;
                }
            }
        }
        return indexOf;
    }

    public static int[] add(int[] array, int number){
        int [] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++){
            if (i == newArray.length-1){
                newArray[i] = number;
            }
            else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public static int[] remove(int[] array, int index){
        int [] newArray = new int[array.length - 1];
        int o = 0;
        for (int i = 0; i < array.length; i++){
            if(i != index){
                newArray[o] = array[i];
                o++;
            }
        }
        return newArray;
    }
}
