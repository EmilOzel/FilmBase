package filmbase.data;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film film){
        films.addLast(film);
    }

    public Film playFilm() {
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




}
