import java.util.Scanner;
import java.lang.Math;

public class Algoritmo42 {
    public static void main(String[] args) {
        double angulo, rang;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um angulo em graus: ");
        angulo = scan.nextDouble();
        rang = angulo * Math.PI / 180;
        System.out.println("Seno: " + Math.sin(rang)); 
        System.out.print("\n");
        System.out.println("Co-seno: " + Math.cos(rang));
        System.out.print("\n");
        System.out.println("Tangente: " + Math.tan(rang));
        System.out.print("\n");
        System.out.println("Co-secante: " + 1/ Math.sin(rang));
        System.out.print("\n");
        System.out.println("Secante: " + 1/ Math.cos(rang));
        System.out.print("\n");
        System.out.println("Cotangente: " + 1/ Math.tan(rang));

    }
    
}
