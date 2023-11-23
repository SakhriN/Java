package org.example.poo.tpbooks;

public class Author {
    int idAuthor;
    int counter;

    String firstname;
    String lastname;


    public Author() {

    }

    {
        counter++;
    }

    public Author(String firstname, String lastname) {
        this.idAuthor = counter;
        this.firstname = firstname;
        this.lastname = lastname;
    }


}
