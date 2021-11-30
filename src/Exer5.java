import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota que has sacado y te dire que tal");
		nota=sc.nextInt();
			if(nota>10||nota<0) {
				System.out.print("El numero proporcionado esta fuera de rango");
				
			}
			switch (nota){
				case 0:
				case 1:
				case 2:
					System.out.println("Muy deficiente");
					break;
				case 3:
				case 4:
					System.out.println("Insuficiente");
					break;
				case 5:
					System.out.println("Suficiente");
					break;
				case 6:
					System.out.println("Bien");
					break;
				case 7:
				case 8:
					System.out.println("Notable");
					break;
				case 9:
				case 10:
					System.out.println("Sobresaliente");
			}
	}

}
