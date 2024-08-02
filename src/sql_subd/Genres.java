package sql_subd;

public class Genres{

    private int genreId;
    private String name;

    public Genres(int genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }
    public int getGenreId() {
        return genreId;
    }

    public String getName() {
        return name;
    }
}
