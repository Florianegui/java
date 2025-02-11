package exo1;

public class Main {

public static void main(String[] args) {
Voiture voiture = new Voiture()(marque:"Toyota",modele:"Corolla", couleur: "Rouge");

System.out.println(Voiture.getMarque() + "" + Voiture.getModele()+ ""+ Voiture.getCouleur);
}
}
