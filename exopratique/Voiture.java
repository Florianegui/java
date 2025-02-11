package exopratique;

public class Voiture implements Transport {
    @Override
    public void deplacer() {
        System.out.println("La voiture roule sur la route.");
    }
}
