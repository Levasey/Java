package HTTP;

public class MainController {
    public static String getMain(){
        return "<a href='/artist_list'>Список исполнителей</a>" +
                "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "\t<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\" stroke-width=\"4\" fill=\"yellow\" />\n" +
                "</svg>";
    }
}
