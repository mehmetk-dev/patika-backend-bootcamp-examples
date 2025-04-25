package hafta3.proje.cinema;

import java.util.ArrayList;
import java.util.Collections;

public class FilmCollection {
    public static void main(String[] args) {

        ArrayList<Film> movie = new ArrayList<>();
        movie.add(new Film("Dungeons",2000,"Macera",2.5));
        movie.add(new Film("Dragons",2002,"Aksiyon",4.2));
        movie.add(new Film("Inception",2005,"Bilim-Kurgu",7.6));
        movie.add(new Film("Interstaller",2010,"Bilim-Kurgu",8.9));
        movie.add(new Film("Star Wars",2040,"Bilim-Kurgu",10.3));

        //Collections sınıfındaki sort metoduyla IMDB puanına göre sıralıyoruz
        Collections.sort(movie);
        System.out.println("IMDB puanına göre düşükten yükseğe sıra");
        movie.forEach(movies -> System.out.println(movies));
        System.out.println("\nIMDB puanına göre yüksekten düşüğe sıra\n");
        Collections.reverse(movie);
        movie.forEach(movies -> System.out.println(movies));

        //Filtrelemek istediğimiz Türle yeni bir array oluşturuyoruz.
        String genreToFilter = "Bilim-Kurgu";
        ArrayList<Film> filteredFilms = Film.filterByGenre(movie,genreToFilter);

        System.out.println("Bilim Kurgu Türündeki Filmler");
        for (Film films : filteredFilms){
            System.out.println(films);
        }
    }
}
