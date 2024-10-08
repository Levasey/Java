package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MainHandler implements HttpHandler {
    Logger logger = Logger.getLogger(MainHandler.class.getName());

    public void handle(HttpExchange exchange) throws IOException {
        LogManager.getLogManager();
        try {
            FileHandler fh = new FileHandler(MainHandler.class.getName());
            fh.setLevel(Level.ALL);
            logger.addHandler(fh);
            logger.finest("самый подробный");
            logger.finer("Еще подробнее");
            logger.fine("Подробный");
            logger.warning("Error");
            logger.info("Метод main");
            logger.severe("все очень плохо");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "File logger not working", e);
        }

        String page = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" + MainController.getMain() +
                "</body>\n" +
                "</html>";
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
