package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Genre;
import filmbase.data.Playlist;

import java.util.*;

public class Filmbase {

    public List<Film> allFilms = new ArrayList<>();
    private Set<Genre> allGenres = new HashSet<>();
    private Map<Genre, Collection<Film>> genreFilms = new HashMap<>();

    public void start() {
        System.out.println("FilmBasen er startet");
        initFilms();
        //printList(allFilms);
        //testFiltering();
        countGenres(allFilms);
        mapAllFilmsToGenres();

    }

    private void initFilms() {
        allFilms.add(new Film("The Godfather", 1972, Genre.Crime, Genre.Drama, Genre.Crime));
        allFilms.add(new Film("Shawshank Redemption", 1994, Genre.Drama));
        allFilms.add(new Film("Schindler's List", 1993, Genre.Biography));
        allFilms.add(new Film("Raging Bull", 1980, Genre.Biography));
        allFilms.add(new Film("Citizen Kane", 1941, Genre.Drama));
        allFilms.add(new Film("Psycho", 1960, Genre.Horror));
        allFilms.add(new Film("ET", 1982, Genre.Family));
        allFilms.add(new Film("The Silence Of The Lambs", 1991, Genre.Crime));
        allFilms.getLast().addGenre(Genre.Crime);


    }

    public void printList(Collection<Film> films) {
        for (Film f : films) {
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
        playlist.addFilm(allFilms.get(0));
        playlist.addFilm(allFilms.get(2));
        playlist.addFilm(allFilms.get(3));
        playlist.addFilm(allFilms.get(7));

        printList(playlist.showFilmList());
        playlist.removeGenre(Genre.Drama);

        System.out.println("\nEfter removeGenre:");
        printList(playlist.showFilmList());


    }


    private void countGenres(Collection<Film> films) {
        for (Film f : films) {
            for (Genre g : f.getGenres()) {
                allGenres.add(g);
            }
        }

        System.out.println("Alle genrer i brug: " + allGenres);
    }

    private void mapFilmsToGenres(){
        Map<Genre, Film> singleMap = new HashMap<>();

        for (Film film : allFilms){
            for (Genre g : film.getGenres()) {
                singleMap.put(g, film);
            }
        }

        System.out.println("\nÉn film pr. genre:");
        for (Genre g : singleMap.keySet()) {
            System.out.println(g + " → " + singleMap.get(g));
        }
    }


    private void mapAllFilmsToGenres() {
        genreFilms.clear();

        for (Film film : allFilms) {
            for (Genre genre : film.getGenres()) {

                if (!genreFilms.containsKey(genre)) {
                    genreFilms.put(genre, new ArrayList<>());
                }

                genreFilms.get(genre).add(film);
            }
        }

        System.out.println("\nAlle film pr. genre:");
        for (Genre genre : genreFilms.keySet()) {
            System.out.println("\n" + genre + ":");
            for (Film f : genreFilms.get(genre)) {
                System.out.println("  " + f);
            }
        }
    }

}
