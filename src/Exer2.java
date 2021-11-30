import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te dire si es par o impar");
		numero = sc.nextInt();
			if (numero % 2 == 0) {
				System.out.print("El número es par");
			} else {
				System.out.println("El número es impar");
			}

	}

}
