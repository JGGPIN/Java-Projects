import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com suas 3 notas: ");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        System.out.println("Entre com o tipo de avaliação:");
        String n = sc.next();

        int ma = multiplicacao(p1, p2, p3);
        int mp = ponderada(p1,p2,p3);

        n = n.toLowerCase();
        if (n.equals("a")) {
            System.out.println("Média aritimética escolhida ");
            System.out.println(ma);
        }
        else if (n.equals("p")) {
            System.out.println("Média ponderada escolhida ");
            System.out.println(mp);
        }
        else {
            System.out.println("Inválido");
        }
        sc.close();
    }
        public static int multiplicacao(int x,int y,int z) {
            return (x + y + z)/3;
        }
        public static int ponderada (int x,int y,int z) {
                return (x * 5 + y * 3 + z * 2)/10;}

        }
