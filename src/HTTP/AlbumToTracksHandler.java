package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;

public class AlbumToTracksHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        int index = query.indexOf("=");
        int albumId = Integer.parseInt(query.substring(index + 1, query.length()));
        String page = null;
        page = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<input type=\"file\" name=\"cover\" accept=\"image/png, image/jpeg\"/>" +
                TracksController.format(albumId) +
                "</body>\n" +
                "</html>";
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
