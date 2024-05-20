import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro operando: ");
        double operando1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo operando: ");
        double operando2 = scanner.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        
        int codigoOperacao = scanner.nextInt();
        
        double resultado = 0;
        
        switch (codigoOperacao) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            case 4:
                resultado = operando1 * operando2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            default:
                System.out.println("Código de operação inválido.");
        }
        
        scanner.close();
    }
}
