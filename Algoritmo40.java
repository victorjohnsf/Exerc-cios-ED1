import java.util.Scanner;

import javax.swing.SpringLayout;

public class Algoritmo40 {
    public static void main(String[] args) {
        int quociente, resto, valor1, valor2;
        Scanner scan = new Scanner (System.in);
        System.out.print("Entre com o dividendo: ");
        valor1 = scan.nextInt();
        System.out.print("Entre com o divisor: ");
        valor2 = scan.nextInt();
        System.out.print("\n");
        quociente = valor1/valor2;
        resto = valor1 % valor2;
        System.out.println("Dividedndo: " + valor1);
        System.out.print("\n");
        System.out.println("Divisor: " + valor2);
        System.out.print("\n");
        System.out.println("Quociente: " + quociente);
        System.out.print("\n");
        System.out.println("Resto: " + resto) ;
    }
    
}
