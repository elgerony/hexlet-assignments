package exercise;
import java.util.List;
import java.util.ArrayList;
import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        List<String> phones = Data.getPhones();
        app.get("/phones", ctx -> {
            ctx.json(phones);
        });
        List<String> domains = Data.getDomains();
        // Обработчик GET /domains
        app.get("/domains", ctx -> {
            ctx.json(domains);
        });

        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
