
package A01_intro;
import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String Palabra = "Demenge";
        char ReplacingLetter = 'e';
        char newLetter;

        StringBuilder sb = new StringBuilder(Palabra);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palabra original: ");
        System.out.println(Palabra);

        System.out.println("Ingrese el caracter que remplazara a la e: ");
        newLetter = scanner.next().charAt(0);

        for (int i = 0; i < Palabra.length() ; i++) {
            if( sb.charAt(i) == ReplacingLetter) {
                sb.setCharAt(i, newLetter);
            }
        }
        System.out.println("Palabra modificada: ");
        System.out.println(sb.toString());
    }
}
