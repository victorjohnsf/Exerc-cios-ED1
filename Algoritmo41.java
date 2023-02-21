import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args) {
        float a, b, c, d, mp;
        Scanner scan = new Scanner (System.in);
        System.out.print("Entre com o primeiro número: ");
        a = scan.nextFloat();
        System.out.print("Entre com o segundo número: ");
        b = scan.nextFloat();
        System.out.print("Entre com o trceiro número: ");
        c = scan.nextFloat();
        System.out.print("Entre com o quarto número: ");
        d = scan.nextFloat();
        System.out.print("\n");
        mp = (a*1 + b*2 + c*3 + d*4)/10 ;
        System.out.println("Média ponderada: " + mp);

    }
    
}
