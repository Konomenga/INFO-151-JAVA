
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("GESTION DES NOTES INF 151");

        System.out.print("Nombre d'etudiants : ");
        int n = clavier.nextInt();
        clavier.nextLine();

        computations calcul = new computations();

        calcul.calculerNotes(n, clavier);

        clavier.close();
    }
}

class computations {

    public void calculerNotes(int n, Scanner clavier) {

        double sommeGenerale = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEtudiant " + i);

            System.out.print("Nom : ");
            String nom = clavier.nextLine();

            System.out.print("Nombre de notes : ");
            int nombre = clavier.nextInt();

            double somme = 0;

            for (int j = 1; j <= nombre; j++) {
                System.out.print("Note " + j + " : ");
                double note = clavier.nextDouble();
                somme += note;
            }

            clavier.nextLine();

            double moyenne = somme / nombre;
            sommeGenerale += moyenne;

            System.out.println("Nom : " + nom);
            System.out.println("Moyenne : " + moyenne + "/20");
        }

        System.out.println("\nMoyenne generale : "
                + (sommeGenerale / n) + "/20");
    }
}
