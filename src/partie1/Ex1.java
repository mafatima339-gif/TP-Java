package partie1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre");
		int n = sc.nextInt();
		if (n>0){
			System.out.print("Le nombre est positif ");
		}else if (n<0){
			System.out.print("Le nombre est négatif ");
			
		}else {
			System.out.print("Le nombre est nul ");
		}
		sc.close();

	}

}
