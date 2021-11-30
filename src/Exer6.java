import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Me vas a dar 3 numeros y los comparare");
		System.out.printf("1º número: ");
		num1 = sc.nextInt();
		System.out.printf("\n2º número: ");
		num2 = sc.nextInt();
		System.out.printf("\n3º número: ");
		num3 = sc.nextInt();

		if (num1 == num2) {

			if (num2 == num3) {
				System.out.printf("Los numeros %d %d Y %d son iguales", num1, num2, num3);
			} else {
				System.out.printf("los numeros %d y %d son iguales", num1, num2);

			}
		} else if (num1 != num2) {
			if(num1==num3) {
				System.out.printf("%d y %d son iguales", num1, num3)
			}else {
				System.
			}
		}
	}
}
