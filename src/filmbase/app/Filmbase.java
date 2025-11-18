package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Genre;
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
        //printList(allFilms);
        testFiltering();

    }

    private void initFilms(){
        allFilms.add(new Film("The Godfather", 1972, Genre.Crime, Genre.Drama));
        allFilms.add(new Film("Shawshank Redemption", 1994, Genre.Drama));
        allFilms.add(new Film("Schindler's List", 1993, Genre.Biography));
        allFilms.add(new Film("Raging Bull", 1980, Genre.Biography));
        allFilms.add(new Film("Citizen Kane", 1941, Genre.Drama));
        allFilms.add(new Film("Psycho", 1960, Genre.Horror));
        allFilms.add(new Film("ET", 1982, Genre.Family));
        allFilms.add(new Film("The Silence Of The Lambs", 1991, Genre.Crime));





    }

    public void printList(Collection<Film> films){
        for(Film f: films){
            System.out.println(f);
        }


    }


//    public void testPlaylist(){
//        initFilms();
//        Playlist playlist = new Playlist();
//        playlist.addFilm(allFilms.get(1));
//        playlist.addFilm(allFilms.get(4));
//        playlist.addFilm(allFilms.get(7));
//        for(Film f:playlist.showFilmList()){
//            System.out.println(f);
//        }
//
//        while (playlist.hasNext()) {
//            Film next = playlist.playFilm();
//            System.out.println("Afspiller: " + next);
//        }
//
//    }


    private void testFiltering() {
        Playlist playlist = new Playlist();
        playlist.addFilm(allFilms.get(1));
        playlist.addFilm(allFilms.get(2));
        playlist.addFilm(allFilms.get(3));
        playlist.addFilm(allFilms.get(7));

        printList(playlist.showFilmList());
        playlist.removeGenre(Genre.Drama);

        System.out.println("\nEfter removeGenre:");
        printList(playlist.showFilmList());


    }

}
