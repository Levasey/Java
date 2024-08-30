package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;

public class ImageHandler implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getRequestURI());
        /*byte imageBytes = File.readAllBytes(new File("./resources/AC-DC"));
        httpExchange.sendResponseHeaders(200, imageBytes.length());*/
    }
}
