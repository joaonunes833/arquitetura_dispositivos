public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println(NumericalUtilities.powerOf(2,2));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersUpTo(2));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersBetween(1,10));
        System.out.println(NumericalUtilities.sumOfEvenNumbersBetween(2,2));*/
        int[] array = ArrayUtilities.copyOf(new int[]{1,2,3});
        System.out.println(ArrayUtilities.toString(array));
    }
}