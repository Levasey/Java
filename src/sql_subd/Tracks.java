package sql_subd;

public class Tracks {

    private int trackId;
    private String name;
    private int albumId;
    private String mediaTypeId;
    private int genreId;
    private String composer;
    private String milliseconds;
    private String bytes;
    private String unitPrice;

    public Tracks(int trackId, String name, int albumId, String mediaTypeId, int genreId, String composer, String milliseconds, String bytes, String unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.albumId = albumId;
        this.mediaTypeId = mediaTypeId;
        this.genreId = genreId;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getName() {
        return name;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getMediaTypeId() {
        return mediaTypeId;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getComposer() {
        return composer;
    }

    public String getMilliseconds() {
        return milliseconds;
    }

    public String getBytes() {
        return bytes;
    }

    public String getUnitPrice() {
        return unitPrice;
    }
}