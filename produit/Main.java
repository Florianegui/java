package produit;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionProduits gestion = new GestionProduits();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Ajouter un produit");
            System.out.println("3. Supprimer un produit");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne

            switch (choix) {
                case 1:
                    List<Produit> produits = gestion.lireProduits();
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        for (Produit p : produits) {
                            System.out.println("Produit : " + p.getNom() + " - Prix : " + p.getPrix() + "€");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nom du produit : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prix du produit : ");
                    double prix = scanner.nextDouble();
                    gestion.ajouterProduit(nom, prix);
                    break;
                case 3:
                    System.out.print("Nom du produit à supprimer : ");
                    String nomSupprimer = scanner.nextLine();
                    gestion.supprimerProduit(nomSupprimer);
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

