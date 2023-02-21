import java.util.Scanner;

public class Algaritmo44 {
    public static void main(String[] args) {
        double num, base, logaritmo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");
        num = scan.nextDouble();
        System.out.print("Entre com a base: ");
        base = scan.nextDouble();
        logaritmo = Math.log(num)/ Math.log(base);
        System.out.print("\n");
        System.out.println("O logaritmo de " + num + " na base " + base + " é: " + logaritmo);

    }
    
}
