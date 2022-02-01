package com.mycompany.app;
import com.othercompany.app.Second;

public class App {
    public static void main(String... args) {
        String message = new Second().wrapMessageIn("|");
        System.out.println(message);
    }
}
