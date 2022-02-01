package com.othercompany.app;
import com.thirdcompany.app.Third;

public class Second {
    public String wrapMessageIn(String delimiter) {
        return delimiter +
            new Third().upperCaseMessage() +
            delimiter;
    }
}
