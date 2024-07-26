package HTTP;

public class ArtistController {
    public static String getArtist(String artistId){
        return "Альбомы Иван Иванов:" +
                "<a href='/album?album_id=70'>Лучшее за 20 лет</a>";
    }
}
