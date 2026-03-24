package partie4;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaine : ");
        String ch = sc.nextLine();

        String inverse = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            inverse = inverse + ch.charAt(i);
        }

        if (ch.equals(inverse)) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
        
        sc.close();

	}

}
