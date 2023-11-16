package org.example.operator;

import java.util.Scanner;

public class Operator {

    public static void exo22() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        nombre = nombre * nombre;
        System.out.println("Le nombre au carré est " + nombre + " !");
        scanner.close();
    }
    public static void exo23() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour, " + nom + "!");
        scanner.close();
    }

    public static void exo24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez prix Hors Taxe : ");
        int prixHT = scanner.nextInt();
        System.out.print("Insérez nombre d'articles : ");
        int nbArticle = scanner.nextInt();
        System.out.print("Insérez la TVA de l'article en pourcent (%) et non a virgule : ");
        float TVA = scanner.nextFloat();

        float prixTTC = (prixHT + prixHT * (TVA / 100) ) * nbArticle;
        System.out.println("Prix hors taxe :" + prixHT + "\nNombre d'article : " + nbArticle + "\n TVA : " + TVA + " %." );
        System.out.println("Bonjour, le prix du ou des articles en incluant la TVA est de :" + prixTTC + " !");
        scanner.close();
    }

    public static void exo31() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez un nombre et vous saurez si il est positif, négatif ou neutre : ");
        float nombre = scanner.nextFloat();
        if (nombre < 0) {
            System.out.println("Le nombre :" + nombre + " est négatif !");
        } else if(nombre > 0){
            System.out.println("Le nombre :" + nombre + " est positif !");
        } else{
            System.out.println("Le nombre :" + nombre + " est neutre !");
        }
        scanner.close();
    }
    public static void exo32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez premier nombre : ");
        float nombre1 = scanner.nextFloat();
        System.out.print("Insérez premier nombre : ");
        float nombre2 = scanner.nextFloat();
        String valeur1;
        String valeur2;

        if (nombre1 < 0) {
         valeur1 = "négatif";
        } else if(nombre1 > 0){
             valeur1 = "positif";
        } else{
             valeur1 = "neutre";
        }


        if (nombre2 < 0) {
             valeur2 = "négatif";
        } else if(nombre2 > 0){
             valeur2 = "positif";
        } else{
             valeur2 = "neutre";
        }

        if (valeur1!= valeur2 && valeur1 != "neutre" && valeur2!="neutre"){
            System.out.println("Valeur du produit des 2 nombres : négatif !" );
        } else if(valeur1== valeur2 && valeur1 != "neutre" && valeur2!="neutre"){
            System.out.println("Valeur du produit des 2 nombres : positif !" );
        } else if(valeur1=="neutre"){
            System.out.println("Valeur du produit des 2 nombres : neutre !" );
        } else if(valeur2=="neutre"){
            System.out.println("Valeur du produit des 2 nombres : neutre !" );
        }
        scanner.close();
    }

}