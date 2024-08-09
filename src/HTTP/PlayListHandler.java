package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class PlayListHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException{
        String page = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "Добавление плейлиста" +
                "<form method=\"post\" action=\"/add_playlist\">\n" +
                "<label>Название:<input name=\"playlist_name\"></label>\n" +
                "<input type=\"submit\"></input>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
