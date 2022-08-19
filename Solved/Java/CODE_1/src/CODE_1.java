import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CODE_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra1 = leer.nextLine();
        String palabra2 = leer.nextLine();
        if (anagrama(palabra1, palabra2)){
            System.out.println("Es un anagrama!");
        }else{
            System.out.println("No es un anagrama :(");
        }
    }

    public static boolean anagrama(String palabra1, String palabra2){
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        } else {
            char word1[] = palabra1.toCharArray();
            char word2[] = palabra2.toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            return new String(word1).equalsIgnoreCase(new String(word2));
        }
    }
}
