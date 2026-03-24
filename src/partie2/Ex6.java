package partie2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Entrez l'element " + i + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Entrez le nombre a rechercher : ");
        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Nombre trouve a la position : " + i);
            }
        }
        sc.close();
    }
		
		


}