
package A01_intro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class IntroducirNumeros {
    public static void main(String[] args) {

        int num = 0;
        int cantNums = 0;

        int min = 0;
        int max = 0;

        int TotalSum = 0;
        int PositivosSum = 0;
        int NegativosSum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribit numeros y ponga -1 para salir");

        while (num != -1){
            num = scanner.nextInt();
            if(num != -1){
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
                if(num > 0){
                    PositivosSum+= num;
                }
                else {
                    NegativosSum+= num;
                }
                TotalSum += num;
                cantNums++;
            }
        }
        System.out.println("la cantidad de numeros escritos son: " + cantNums);
        System.out.println("El mayor numero escrito es: " + max);
        System.out.println("El menor numero escrito es: " + min);


        System.out.println("La suma total de  numeros escrito es: " + TotalSum);
        System.out.println("La suma total de  numeros positivos escrito es: " + PositivosSum);
        System.out.println("La suma total de  numeros negativos escrito es: " + NegativosSum);

    }

}
