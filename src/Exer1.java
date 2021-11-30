import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número entero");
		numero = sc.nextInt();
		if (numero > 1000) {
			System.out.println((numero * 0.15));
		} else {
			System.out.println(numero);
		}
	}
}
