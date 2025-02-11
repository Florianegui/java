package exo3;

public class Main {
    public static void main(String[] args) {
        CB compte1 = new CB("Loïc", 1000);
        compte1.retirer(500);
        compte1.deposer(300);
        compte1.retirer(3000);
    }
}
