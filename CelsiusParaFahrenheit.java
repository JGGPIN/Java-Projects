import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir = 's';
        
        while (repetir == 's') {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = (9 * celsius / 5) + 32;
            System.out.println("Equivalente em Fahrenheit: " + fahrenheit);
            
            System.out.print("Deseja repetir (s/n)? ");
            repetir = scanner.next().charAt(0);
        }
        
        scanner.close();
    }
}
