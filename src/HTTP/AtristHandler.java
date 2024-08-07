package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AtristHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        int index = query.indexOf("=");
        int artistId = Integer.parseInt(query.substring(index + 1, query.length()));
        String page = null;
        try {
            page = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" + ArtistController.format(artistId) +
                    "</body>\n" +
                    "</html>";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
