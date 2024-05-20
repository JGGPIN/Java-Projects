import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a: ");
        double a = sc.nextDouble();
        
        System.out.println("Digite b: ");
        double b = sc.nextDouble();
        
        System.out.println("Digite c: ");
        double c = sc.nextDouble();
        
        double at = (a * c) / 2;
        System.out.println("Área do triângulo retângulo: " + at);
        
        double pi = 3.14;
        double ac = pi * Math.pow(c, 2);
        System.out.println("Área do círculo: " + ac);
        
        double atr = ((a + b) * c) / 2; 
        System.out.println("Área do trapézio: " + atr);
        
        double aq = Math.pow(b, 2);
        System.out.println("Área do quadrado: " + aq);
        
        double ar = a * b;
        System.out.println("Área do retângulo: " + ar);
        
        sc.close(); 
    }
}
