import java.util.Scanner;

public class ask {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Entrer votre nom");
    String nom = scanner.nextLine();

    System.out.print ("Entrer votre age");
    int age =0;
    if (scanner.hasNextInt()){
       age = scanner.nextInt();
    } else {
        System.out.println("age non correct");
        System.exit(0);
    }

    System.out.println("Bonjour, " +nom + "! Vous avez" + age + "ans");

    scanner.close();
     
        if (age >18) {
            System.out.println("vous etes majeur");
        } else {
            System.out.println("vous etes mineur");
        }
   }
}
