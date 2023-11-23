package org.example.poo.tpbooks;

public class Convention {
    public static void main(String[] args) {
        Author test1 = new Author("Michel","Sardou");

        Publisher tost1 = new Publisher("LaBagarre");

        Book Nulachier = new Book("Pourquoi je suis un mauvais chanteur",new Author[]{test1},tost1,2012,69,29.12F);
    }
}
