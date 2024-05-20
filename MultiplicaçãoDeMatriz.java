import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz");
        int n = sc.nextInt();
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] matrizResposta = new int[n][n];

        System.out.println("Preencha a primeira matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite um número: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Preencha a segunda matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite um número: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    matrizResposta[i][j] = matriz1[i][k] + matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz Resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizResposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
