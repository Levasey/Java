package dto;

public class PlaylistTrack {
    private int playlistId;
    private int trackId;

    public PlaylistTrack(int playlistId, int trackId) {
        this.playlistId = playlistId;
        this.trackId = trackId;
    }
    public int getTrackId() {
        return trackId;
    }
    public int getPlaylistId() {
        return playlistId;
    }
}
