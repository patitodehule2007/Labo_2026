
package A01_intro;
import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra 1: ");
        String Palabra1 = scanner.next();
        System.out.println("Ingrese la palabra 2: ");
        String Palabra2 = scanner.next();

        if(Palabra1.equals(Palabra2)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No Son iguales");
        }



    }

}
