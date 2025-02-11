package exoetudiant;

import java.util.ArrayList;

public class GE {
    private ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    // Ajouter un étudiant
    public void ajouterEtudiant(String nom, int age) {
        listeEtudiants.add(new Etudiant(nom, age));
        System.out.println(nom + " a été ajouté.");
    }

    // Afficher la liste des étudiants
    public void afficherEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
        } else {
            for (Etudiant e : listeEtudiants) {
                System.out.println(e);
            }
        }
    }

    // Supprimer un étudiant par son nom
    public void supprimerEtudiant(String nom) {
        boolean supprime = listeEtudiants.removeIf(etudiant -> etudiant.getNom().equalsIgnoreCase(nom));
        if (supprime) {
            System.out.println(nom + " a été supprimé.");
        } else {
            System.out.println("Étudiant non trouvé.");
        }
    }
}

