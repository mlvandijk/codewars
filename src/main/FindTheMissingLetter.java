package kata;

/**
 * Created by Marit on 19-2-2017.
 */
public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array)  {
        char c = '_';
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        String ALFA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letter = "" + array[0];
        int index = 0;
        boolean lowercase = false;
        if (alfa.contains(letter)) {
            index = alfa.indexOf(letter);
            lowercase = true;
        } else {
            index = ALFA.indexOf(letter);
        }
        for (int i = index; i < array.length - 1; i++){
            if (lowercase) {
                if (array[i + 1] != alfa.charAt(i + 1)){
                    c = alfa.charAt(i + 1);
                }
            } else {
                if (array[i + 1] != ALFA.charAt(i + 1)){
                    c = ALFA.charAt(i + 1);
                }
            }
        }
        return c;
    }
}
