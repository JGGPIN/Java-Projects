package main;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		int e,f,g;
				System.out.println("Digite o valor de a:");
					a = sc.nextInt();
				System.out.println("Digite o valor de b:");
					b = sc.nextInt();
				System.out.println("Digite o valor de c:");
					c = sc.nextInt();
				System.out.println("Digite o valor de d:");
					d = sc.nextInt();
		e = a * b;
		f = c * d;
			g = e - f;	
				System.out.println("O valor de final é" + g);
sc.close();
	}
	
}
