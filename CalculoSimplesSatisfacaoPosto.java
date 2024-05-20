import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alcool = 0, gasolina = 0, diesel = 0;
        int tipoCombustivel = 0;
        
        while (tipoCombustivel != 4) {
            System.out.println("Digite o tipo de combustível abastecido:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            tipoCombustivel = scanner.nextInt();
            
            if (tipoCombustivel == 1) {
                alcool++;
            } else if (tipoCombustivel == 2) {
                gasolina++;
            } else if (tipoCombustivel == 3) {
                diesel++;
            } else if (tipoCombustivel < 1 || tipoCombustivel > 4) {
                System.out.println("Código inválido. Por favor, digite novamente.");
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        scanner.close();
    }
}
