package org.example.poo.bibliotheque;

public class Gerant {

    public static void main(String[] args) {

        Personne personne1 = new Personne("Jospin","Remi");
        Personne personne2 = new Personne("Sakhri","Nassim");

        LivrePapier Livre = new LivrePapier("Dormir en 75 étapes","Stephen Hawking",69,"Maison de fou");
        LivreNumerique bloc = new LivreNumerique("Le poker pour les nuls","Nassim Sakhri","7zip",1000000000);

        Emprunt emprunt2 = new Emprunt(personne2, Livre);
        Emprunt emprunt1 = new Emprunt(personne1,bloc);


        System.out.println(emprunt1);
        System.out.println(emprunt2);
    }
}
