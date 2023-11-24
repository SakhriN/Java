package org.example.poo.tpbooks;

public class Author {
    int idAuthor;
    int counter;

    String firstname;
    String lastname;


    public Author() {

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Author(int idAuthor, String firstname, String lastname) {
        this.idAuthor = idAuthor;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
