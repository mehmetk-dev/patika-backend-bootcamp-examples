package Hafta3.Proje.Kitapçı.Model;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Yazar " +
                "Adı: '" + name + '\'' +
                " Soyadı: '" + surname + '\'' +
                '}';
    }
}
