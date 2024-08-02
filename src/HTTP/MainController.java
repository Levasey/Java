package HTTP;

public class MainController {
    public static String getMain(){
        return "<ol>" +
                "<li><a href='/artist_list'>Список исполнителей</a></li>" +
                "<li><a href='/genre_list'>Список жанров</a></li>" +
                "</ol>";
    }
}
