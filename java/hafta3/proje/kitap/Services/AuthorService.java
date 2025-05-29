package hafta3.proje.kitap.Services;

import hafta3.proje.kitap.Model.Author;

import java.util.*;

public class AuthorService {

    Map<String, Author> authors = new HashMap();

    public void createAuthor(String name, String surname) {
        Author author = new Author(name, surname);
        authors.put(name, author);
    }

    public void listAuthors() {
        for (Author author : authors.values()) {
            System.out.println(author.getName() + " " + author.getSurname());
        }
    }

    public Author findAuthor(String name) {
        return authors.get(name);
    }


}
