public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        int resultado = multiplicacao(num1, num2);
        System.out.println("O resultado da multiplicação de " + num1 + " e " + num2 + " é: " + resultado);
    }
    
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
}
