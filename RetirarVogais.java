import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu texto: ");
        String input = sc.nextLine();

        String result = removevogal(input);
        System.out.println("Seu no toxto: " + result);

        scanner.close();
    }

    public static String removevogal(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}
