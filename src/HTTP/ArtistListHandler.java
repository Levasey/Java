package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArtistListHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        ArrayList<Artists> a = null;
        try {
            a = ArtistListController.getData();
            String page = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" + ArtistListController.format(a) +
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
