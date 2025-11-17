package filmbase.data;

public class Film {
    private String Title;
    private int Year;
    private Genre genre;

    public Film(String Title, int Year) {
        this.Title = Title;
        this.Year = Year;
    }

    public Film(String title,int year, Genre genre) {
        Year = year;
        Title = title;
        this.genre = genre;
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


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public boolean hasGenre(Genre genre) {
        return this.genre == genre;
    }


    public void removeGenre(Genre genre) {
        if (this.genre == genre) {
            this.genre = null;
        }
    }


    @Override
    public String toString() {
        return "Film: " +
                "" + Title +
                " (" + Year+")" + " : " + genre;
    }
}
