public class Main {
    public static void main(String[] args) {
        int number = 2;
        char letter = 'a';
        letter+= number;
        System.out.println(CharacterUtilities.copyOfPartOf(new char[] {'a','b','c','d','e','f'},2,5));
    }
}