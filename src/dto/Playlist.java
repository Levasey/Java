package dto;

public class Playlist {
    private int playlistId;
    private String name;

    public Playlist(int playlistId, String name) {
        this.playlistId = playlistId;
        this.name = name;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public String getName() {
        return name;
    }
}
