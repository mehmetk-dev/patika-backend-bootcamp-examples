package Hafta3.Proje.Cinema;

import java.util.ArrayList;
import java.util.Comparator;

public class Film implements Comparable<Film> {
    /* Film Classı Tasarımı
Bir Film classı oluşturunuz. Bu classın aşağıdaki özelliklere sahip olması gerekmektedir:

Film adı (String)

Yayın yılı (int)

Film türü (String)

IMDb puanı (double)

Film Koleksiyonu Oluşturma ve Sıralama
Bir List kullanarak 5 farklı film nesnesi oluşturun ve bu filmleri aşağıdaki gibi sıralayınız:

Filmleri IMDb puanına göre büyükten küçüğe sıralayınız.

Filmleri yayın yılına göre küçükten büyüğe sıralayınız.

Film Filtreleme
Bir metod yazın ve şu işlemi yapın:

Belirli bir film türünü parametre olarak alarak o türe ait filmleri filtreleyin.

Filtrelenmiş filmleri ekrana yazdırın.*/

    private String filmName;
    private int yearOfPublication;
    private String filmGenre;
    private Double imdbRating;

    public Film(String filmName, int yearOfPublication, String filmGenre, Double imdbRating) {
        this.filmName = filmName;
        this.yearOfPublication = yearOfPublication;
        this.filmGenre = filmGenre;
        this.imdbRating = imdbRating;


    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "IMDB Puanı: " + imdbRating +"| " +
                "Film Adı: " + filmName +"| " +
                "Film Türü: " + filmGenre +"| " +
                "Yapım Yılı: " +  yearOfPublication;
    }

    @Override
    public int compareTo(Film films) {
        return this.imdbRating.compareTo(films.imdbRating);
    }
    public static ArrayList<Film> filterByGenre(ArrayList<Film> films, String genre){
        ArrayList<Film> filteredFilm = new ArrayList<>();
        for (Film film : films){
            if (film.getFilmGenre().equalsIgnoreCase(genre)){
                filteredFilm.add(film);
            }
        }
        return filteredFilm;
    }
}
