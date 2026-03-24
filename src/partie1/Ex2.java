package partie1;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le premier nombre");
		int a = sc.nextInt();
		
		System.out.print("Entrez le dexieme nombre");
		int b = sc.nextInt();
		
		System.out.print("Entrez le troiseme nombre");
		int c = sc.nextInt();
		
		int max = a ; 
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c ;
		}
			
		
		System.out.print("le plus grande nombre de ces trois est: " +max);
		
		sc.close();

	}

}
