package org.example.fonction;

import java.util.Scanner;

public class Fonction {
    public static int findMaxIntInArray(int[] intArray) {
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i==0){
                max = intArray[i];
            }
            if (intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }
    public static void drawRectangle(int hauteur, int largeur) {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if(i==0||i==(hauteur-1)||j==0||j==(largeur-1)){
                    if (j==(hauteur-1)){
                        System.out.println("*");
                    } else{
                        System.out.print("*");
                    }
                } else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static int getWordsAmount (String mots) {
        String[] mots2 = mots.split("\\s+");
        return mots2.length;
    }
//    public static String[] filterWordsByLength(int minLength, String[] mots) {
//
//    }
//    public static int gcdRecursive(int firstNumber, int secondNumber) {
//
//    }

    public static void getExo1() {

//findMaxIntInArray();
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez des nombres que vous voulez en les séparant par des espaces.");
        String nombres = imprimante.nextLine();
        String[] nombresEnString = nombres.split("\\s+");
        System.out.println(nombresEnString.length);
        int[] intArray = new int[nombresEnString.length];
        for (int i = 0; i < nombresEnString.length; i++) {
            intArray[i] = Integer.parseInt(nombresEnString[i]);
            System.out.println(intArray[i]);
        }
        System.out.println(findMaxIntInArray(intArray));
        imprimante.close();
    }

    public static void getExo2() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("dites moi la hauteur d'un rectangle désiré.");
        int hauteur = imprimante.nextInt();
        System.out.println("dites moi la largeur d'un rectangle désiré.");
        int largeur = imprimante.nextInt();
        drawRectangle(hauteur,largeur);
        imprimante.close();
    }

    public static void getExo3() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez des mots que vous voulez en les séparant par des espaces.");
        String mots = imprimante.nextLine() ;
        System.out.println(getWordsAmount(mots));
        imprimante.close();
    }

    public static void getExo4() {
        Scanner imprimante = new Scanner(System.in);

        System.out.println("Ecrivez des mots que vous voulez en les séparant par des espaces.");
        String mots = imprimante.nextLine();

        imprimante.close();
    }

    public static void getExo6() {
        Scanner imprimante = new Scanner(System.in);
        imprimante.close();
    }


}

