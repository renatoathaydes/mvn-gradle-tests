package com.mycompany.app;
import com.othercompany.app.Second;
import com.fourthcompany.app.Fourth;

public class App {
    public static void main(String... args) {
        String message = new Second().wrapMessageIn("|");
        // dev decided to use fourth v1.0 directly, but
        // upgraded to third 1.1, failing to notice it requires fourth 1.1
        message += new Fourth().getMessage();
        System.out.println(message);

    }
}
