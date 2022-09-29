public class Main {
    public static float perimeterRectangle(float width,float length){
        float perimeter = 2 * (width + length);
        return perimeter;
    }
    public static float volumeParallelepiped(float width, float length, float height){
        float area = width * length;
        float volume = area * height;
        return volume;
    }
    public static float fahrenheitToCelsius(float F){
        float C = (F - 32) * 5/9;
        return C;
    }
    public static float timeToSeconds(float hours, float minutes){
        float hoursToSeconds = hours * 3600;
        float minutesToSeconds = minutes * 60;
        float totalSeconds = hoursToSeconds + minutesToSeconds;
        return totalSeconds;
    }
    public static int maximum(int[] array){
        int maxNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
    public static int minimum(int[] array){
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minNumber){
                minNumber = array[i];
            }
        }
        return minNumber;
    }
    public static int average(int[] array){
        int avgNumber = 0;
        for (int i = 0; i < array.length; i++) {
            avgNumber += array[i];
        }
        avgNumber = avgNumber / array.length;
        return avgNumber;
    }
    public static void main(String[] args) {
        System.out.println("O máximo é: " + maximum(new int[]{3, 1, 2, 6, 4, 2}));
        System.out.println("O mínimo é: " + minimum(new int[]{3, 1, 2, 6, 4, 2}));
        System.out.println("A média é: " + average(new int[]{3, 1, 2, 6, 4, 2}));
    }

}