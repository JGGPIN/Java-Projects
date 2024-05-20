import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a coordenada x: ");
        double x = scanner.nextDouble();
        
        System.out.println("Digite a coordenada y: ");
        double y = scanner.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            } else {
                System.out.println("Quadrante 4");
            }
        }
        
        scanner.close();
    }
}
