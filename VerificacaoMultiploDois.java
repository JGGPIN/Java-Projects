public class Main {
    public static void main(String[] args) {
        int numero = 6;
        verificaMultiploDeDois(numero);
    }
    
    public static void verificaMultiploDeDois(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é múltiplo de 2.");
        } else {
            System.out.println(numero + " não é múltiplo de 2.");
        }
    }
}
