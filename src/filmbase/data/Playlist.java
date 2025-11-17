package filmbase.data;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Film> films = new ArrayList<>();

    public boolean addFilm(Film film){
        if(films.contains(film)){
            return false;
        }
        films.addLast(film);
        return true;
    }

    public Film playFilm() {
        if (films.isEmpty()) return null;
        return films.removeFirst();
    }

    public Film displayNextFilm(){
        return films.getFirst();
    }

    public int filmAmount(){
        return films.size();
    }

    public List<Film> showFilmList(){
        return films;
    }

    public void clearFilmList(){
        films.clear();
    }

    public boolean hasNext(){
        if(films.isEmpty()){
            return false;

        }else {
            return true;
        }
    }


    public void removeGenre(Genre genre) {
//        for (Film film : films) {
//            if (film.hasGenre(genre)) {
//                films.remove(film);
//            }
//        }
        films.removeIf(film -> film.hasGenre(genre));

    }

}
