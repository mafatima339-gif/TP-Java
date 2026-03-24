package partie4;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaine : ");
        String ch = sc.nextLine();

        int compteur = 0;

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'
             || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
                compteur++;
            }
        }

        System.out.println("Nombre de voyelles : " + compteur);
        
        sc.close();

	}

}
