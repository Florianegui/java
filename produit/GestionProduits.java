package produit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionProduits {
    private final String fichier = "produits.txt";

    // Lire et retourner tous les produits
    public List<Produit> lireProduits() {
        List<Produit> produits = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] parts = ligne.split(",");
                if (parts.length == 2) {
                    String nom = parts[0].trim();
                    double prix = Double.parseDouble(parts[1].trim());
                    produits.add(new Produit(nom, prix));
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier : " + e.getMessage());
        }
        return produits;
    }

    // Ajouter un produit
    public void ajouterProduit(String nom, double prix) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichier, true))) {
            bw.write(nom + "," + prix);
            bw.newLine();
            System.out.println(nom + " ajouté avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ajout : " + e.getMessage());
        }
    }

    // Supprimer un produit par son nom
    public void supprimerProduit(String nomProduit) {
        List<Produit> produits = lireProduits();
        boolean trouve = produits.removeIf(p -> p.getNom().equalsIgnoreCase(nomProduit));

        if (trouve) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichier))) {
                for (Produit p : produits) {
                    bw.write(p.toString());
                    bw.newLine();
                }
                System.out.println(nomProduit + " supprimé avec succès !");
            } catch (IOException e) {
                System.out.println("Erreur lors de la suppression : " + e.getMessage());
            }
        } else {
            System.out.println("Produit non trouvé.");
        }
    }
}

