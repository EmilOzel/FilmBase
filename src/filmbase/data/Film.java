package filmbase.data;

import java.util.*;

public class Film {
    private String Title;
    private int Year;
    private Set<Genre> genres = new TreeSet<>();

    public Film(String title,int year, Genre... genres) {
        this.Year = year;
        this.Title = title;
        this.genres.addAll(List.of(genres));
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear(){
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }


    public Collection<Genre> getGenres() {
        return genres;
    }

    public boolean hasGenre(Genre genre) {
        return genres.contains(genre);
    }


    public void removeGenre(Genre genre) {
        genres.remove(genre);
    }


    @Override
    public String toString() {
        return "Film: " +
                "" + Title +
                " (" + Year+")" + " : " + genres;
    }

    public void addGenre(Genre genre) {
        if (!genres.contains(genre)) {
            genres.add(genre);
        }
    }
}
