import java.util.Scanner;
import java.lang.Math;

public class Algoritmo43 {
    public static void main (String[]args) {
        double num, logaritmo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");
        num = scan.nextDouble();
        logaritmo =Math.log10(num);
        System.out.print("\n");
        System.out.println("Logaritmo: " + logaritmo);


    }
    
}
