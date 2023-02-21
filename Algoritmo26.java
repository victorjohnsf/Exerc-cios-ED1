import java.util.Scanner;

public class Algoritmo26 {
    public static void main(String[] args) {
        int data, dia, mes, ano, novadata;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite data no formato ddmmaa:");
        data = scan.nextInt();
        dia = data/10000;
        mes = data % 10000/100;
        ano = data % 100;
        System.out.print("\n");
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        novadata = mes * 10000 + dia * 100 + ano;
        System.out.print("\n");
        System.out.println("DATA NO FORMATO MMDDAA: " + novadata);
    }
    
}
