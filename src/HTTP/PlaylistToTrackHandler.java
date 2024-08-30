package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class PlaylistToTrackHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException, NullPointerException {
        String query = exchange.getRequestURI().getQuery();
        int index = query.indexOf("=");
        int playlistId = Integer.parseInt(query.substring(index + 1, query.length()));
        String page = null;
        try {
            page = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<style>\n" +
                    ".button {\n" +
                    "  border: none;\n" +
                    "  color: white;/* Белый цвет текста */\n" +
                    "  padding: 4px 8px;/* Поля вокруг текста */\n" +
                    "  text-align: center;\n" +
                    "  text-decoration: none;/* Убираем подчёркивание */\n" +
                    "  border-radius: 3px;/* Скругляем уголки */\n" +
                    "  display: inline-block;\n" +
                    "  font-size: 16px;\n" +
                    "  margin: 4px 2px;\n" +
                    "  cursor: pointer;\n" +
                    "}\n" +
                    "\n" +
                    ".delButton {background-color: #FF0000;} /* RED */" +
                    ".listButton {background-color: #8C959D;} /* Grey */" +
                    "</style>" +
                    "<head/>\n" +
                    "<body>\n" +
                    "Добавление треков" +
                    "<form method=\"post\" action=\"/add_track_to_playlist\">\n" +
                    "<input type=\"hidden\" name=\"playlist\" value=\"" + playlistId + "\">" +
                    "<select name=\"track\">" + TracksController.allTracks(playlistId) +
                    "</select>" +
                    "<input type=\"submit\"></input>\n" +
                    "</form>\n" +
                    PlaylistTrackController.format(playlistId) +
                    "</body>\n" +
                    "</html>";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
