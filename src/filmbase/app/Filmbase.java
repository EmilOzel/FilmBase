package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Filmbase {

    public List<Film> allFilms = new ArrayList<>();

    public Filmbase() {
    }

    public void start(){
        System.out.println("FilmBasen er startet");
        initFilms();
        printList(allFilms);
    }

    private void initFilms(){
        allFilms.add(new Film("The Godfather", 1972));
        allFilms.add(new Film("Shawshank redemption", 1994));
        allFilms.add(new Film("Schindler's List", 1993));
        allFilms.add(new Film("Raging Bull", 1980));
        allFilms.add(new Film("Citizen Kane", 1941));
        allFilms.add(new Film("Psycho", 1960));
        allFilms.add(new Film("ET", 1982));
        allFilms.add(new Film("The Silence Of The Lambs", 1991));

    }

    public void printList(Collection<Film> films){
        for(Film f: allFilms){
            System.out.println(f);
        }

    }


    private void testPlaylist(){
        Playlist playlist = new Playlist();
        playlist.addFilm(allFilms.get(1));
    }

}
