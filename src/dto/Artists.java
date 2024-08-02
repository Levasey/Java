package dto;

public class Artists {
    private int artistId;
    private String name;

    public Artists(int artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getArtistId() {
        return artistId;
    }
}