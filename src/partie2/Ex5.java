package partie2;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la taille du tableau :");
		int n = sc.nextInt();
		int[] tab = new int[n];
		for ( int i = 0; i<n ; i++) {
			System.out.print("Entrez l'element " + i + ":");
			tab[i] = sc.nextInt();
			
		}
		for ( int i = 0; i<n ; i++) {
			System.out.print(tab[i]);

	}
		sc.close();

}
}