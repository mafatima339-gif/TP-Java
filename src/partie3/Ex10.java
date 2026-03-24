package partie3;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];

        System.out.println("Remplir la matrice :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                matrice[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrice originale :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrice transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
	}

}
