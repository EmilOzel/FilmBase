package filmbase.data;

public class Film {
    private String Title;
    private int Year;

    public Film(String Title, int Year) {
        this.Title = Title;
        this.Year = Year;
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

    @Override
    public String toString() {
        return "Film: " +
                "" + Title +
                " (" + Year+")";
    }
}
