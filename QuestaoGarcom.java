import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas bandejas o garçom tentou entregar? ");
        int numeroBandejas = scanner.nextInt();
        int totalCoposQuebrados = 0;
        for (int i = 0; i < numeroBandejas; i++) {
            System.out.print("Quantidade de latas na bandeja " + (i + 1) + ": ");
            int latas = scanner.nextInt();
            
            System.out.print("Quantidade de copos na bandeja " + (i + 1) + ": ");
            int copos = scanner.nextInt();
            
            totalCoposQuebrados += calcularCoposQuebrados(latas, copos);
        }
        
        System.out.println("Total de copos quebrados: " + totalCoposQuebrados);
        
        scanner.close();
    }
    
    public static int calcularCoposQuebrados(int latas, int copos) {
        if (latas > copos) {
            return copos;
        }
        return 0;
    }
}
