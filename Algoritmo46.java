import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args) {
        double saldo, novosaldo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite saldo: ");
        saldo = scan.nextDouble();
        novosaldo = saldo * 1.01;
        System.out.print("\n");
        System.out.println("Novo saldo: " + novosaldo);

    }
    
}
