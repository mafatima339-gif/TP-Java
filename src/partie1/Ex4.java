package partie1;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez N");
		int n = sc.nextInt();
		
		int i = 1 ;
		int somme = 0 ; 
		while (i <= n) {
			somme = somme+i ;
			i++;
		}
		System.out.println("la somme est :" +somme);
		
		sc.close();

	}

}
