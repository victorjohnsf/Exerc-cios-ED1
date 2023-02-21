import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args) {
        int a;
        int d;
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite número de tres casas: ");
        a = scan.nextInt();
        d = a % 100/10;
        System.out.println("Algarismo da casa das dezenas: " + d);

        
    }
    
}
