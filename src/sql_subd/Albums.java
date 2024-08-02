package sql_subd;

public class Albums {
    private int albumId;
    private String title;
    private int artistId;
    public Albums(int albumId, String title, int artistId) {
            this.albumId = albumId;
            this.title = title;
            this.artistId = artistId;
        }

        public int getArtistId() {
            return artistId;
        }

        public int getAlbumId() {
            return albumId;
        }

        public String getTitle() {
            return title;
        }
}
