public class CaesarCipherDecipherer {
    public static String cipher(String entry){
        String result = "";
        String abcDefault = "abcdefghijklmnopqrstuvwxyz";
        String abcCipher = "defghijklmnopqrstuvwxyzabc";
        boolean alreadySpaced = false;
        for (int i = 0; i < entry.length(); i++){
            alreadySpaced = false;
            for (int o = 0; o < abcDefault.length(); o++){
                if (entry.charAt(i) == abcDefault.charAt(o)){ // se o character for o mesmo no abecedario convencional
                    result += abcCipher.charAt(o);
                }
                if (entry.charAt(i)==' ' && alreadySpaced == false) { //se o character for vazio/ um espaço
                    result += ' ';
                    alreadySpaced = true;
                    continue;
                }
            }
        }
        return result;
    }
    public static String decipher(String entry){
        String result = "";
        String abcDefault = "abcdefghijklmnopqrstuvwxyz";
        String abcCipher = "defghijklmnopqrstuvwxyzabc";
        boolean alreadySpaced = false;
        for (int i = 0; i < entry.length(); i++){
            alreadySpaced = false;
            for (int o = 0; o < abcCipher.length(); o++){
                if (entry.charAt(i) == abcCipher.charAt(o)){ // se o character for o mesmo na cifra de César
                    result += abcDefault.charAt(o);
                }
                if (entry.charAt(i)==' ' && alreadySpaced == false) { //se o character for vazio/ um espaço
                    result += ' ';
                    alreadySpaced = true;
                    continue;
                }
            }
        }
        return result;
    }
}
