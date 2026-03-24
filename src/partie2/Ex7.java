package partie2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la taille du tableau :");
		int n = sc.nextInt();
		int[] tab = new int[n];
		for ( int i = 0; i<n ; i++) {
			System.out.print("Entrez l'element " + i + ":");
			tab[i] = sc.nextInt();
			int max = tab[0];

	        for (int i1 = 1; i1 < n; i1++) {
	            if (tab[i1] > max) {
	                max = tab[i1];
	            }
	        }

	        System.out.println("Le plus grand element est : " + max);
			
		}
		sc.close();

	}

}
