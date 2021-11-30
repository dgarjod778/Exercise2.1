import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros y te dire si son multiplos o no");
		System.out.print("Número 1:");
		num1 = sc.nextInt();
		System.out.printf("\nNúmero 2:");
		num2 = sc.nextInt();
			if (num1 % num2 == 0) {
				System.out.printf("El numero %d es multiplo %d", num2, num1);
			} else {
				System.out.printf("El numero %d no es multiplo de %d", num2, num1);
			}
	}

}
