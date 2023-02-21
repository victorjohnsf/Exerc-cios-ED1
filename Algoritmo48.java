import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args) {
        double sm, quantidade, preco, vp, vd;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com salário mínimo: ");
        sm = scan.nextDouble();
        System.out.print("Entre com a quantidade em quilowatt: ");
        quantidade = scan.nextDouble();
        preco = sm/700;
        vp = preco * quantidade;
        vd = vp * 0.9;
        System.out.println("\nPreço do quilowatt: " + preco + "\n\nValor a ser pago: " + vp + 
        "\n\nValor com desconto: " + vd);
    }
    
}
