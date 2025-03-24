package Hafta3.Proje.Kitapçı.Model;

import java.time.LocalDate;

public class Book extends Product{
    public Author author;
    private LocalDate publishDate;

    public Book(String name, double price,Author author,LocalDate publishDate) {
        super(name, price);
        this.author = author;
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Kitap: " + author +
                ",Kitap adı: '" + name + '\'' +
                ",Fiyat: " + price ;
    }
}
