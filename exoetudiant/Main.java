package exoetudiant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GE gestion = new GE();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants");
            System.out.println("3. Supprimer un étudiant par nom");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Nom de l'étudiant : ");
                    String nom = scanner.nextLine();
                    System.out.print("Âge de l'étudiant : ");
                    int age = scanner.nextInt();
                    gestion.ajouterEtudiant(nom, age);
                    break;
                case 2:
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Nom de l'étudiant à supprimer : ");
                    String nomSupprimer = scanner.nextLine();
                    gestion.supprimerEtudiant(nomSupprimer);
                    break;
                case 4:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide, réessayez.");
            }
        } while (choix != 4);

        scanner.close();
    }
}

