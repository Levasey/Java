package sql_subd;

public class Albums {
    private String albumId;
    private String title;
    private String artistId;
    public Albums(String albumId, String title, String artistId) {
            this.albumId = albumId;
            this.title = title;
            this.artistId = artistId;
        }

        public String getArtistId() {
            return artistId;
        }

        public String getAlbumId() {
            return albumId;
        }

        public String getTitle() {
            return title;
        }
}
