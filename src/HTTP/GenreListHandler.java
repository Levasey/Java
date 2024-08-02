package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class GenreListHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        StringBuilder genres = null;
        try {
            genres = GenreListController.format();
            String page = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" + genres +
                    "</body>\n" +
                    "</html>";
            exchange.sendResponseHeaders(200, page.getBytes().length);
            PrintWriter writer = new PrintWriter(exchange.getResponseBody());
            writer.write(page);
            writer.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
