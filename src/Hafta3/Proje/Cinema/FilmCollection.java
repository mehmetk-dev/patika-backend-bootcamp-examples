package Hafta3.Proje.Cinema;

import java.util.ArrayList;
import java.util.Collections;

public class FilmCollection {
    public static void main(String[] args) {

        ArrayList<Film> movie = new ArrayList<>();
        Film film1 = new Film("Dungeons",2000,"Macera",2.5);
        Film film2 = new Film("Dragons",2002,"Aksiyon",4.2);
        Film film3 = new Film("Inception",2005,"Bilim-Kurgu",7.6);
        Film film4 = new Film("Interstaller",2010,"Bilim-Kurgu",8.9);
        Film film5 = new Film("Star Wars",2040,"Bilim-Kurgu",10.3);

        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);

        Collections.sort(movie);
        System.out.println("IMDB puanına göre düşükten yükseğe sıra");
        movie.forEach(movies -> System.out.println(movies));
        System.out.println("\nIMDB puanına göre yüksekten düşüğe sıra\n");
        Collections.reverse(movie);
        movie.forEach(movies -> System.out.println(movies));

        String genreToFilter = "Bilim-Kurgu";
        ArrayList<Film> filteredFilms = Film.filterByGenre(movie,genreToFilter);

        System.out.println("Bilim Kurgu Türündeki Filmler");
        for (Film films : filteredFilms){
            System.out.println(films);
        }
    }


}
