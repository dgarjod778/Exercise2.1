import java.util.Scanner;
public class Exer4 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
			System.out.println("Dime un número y te dire si es 0, positivo o negativo");
			numero=sc.nextInt();
				if(numero==0){
					System.out.println("El número introducido es 0");
				}else if(numero>0) {
					System.out.println("El número introducio es positivo");
					
				}else {
					System.out.println("El número introducido es negativo");
				}
				
			
	}

}
