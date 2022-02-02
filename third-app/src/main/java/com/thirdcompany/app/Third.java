package com.thirdcompany.app;
import com.fourthcompany.app.Fourth;

public class Third {
    public String upperCaseMessage() {
        // the dev decided to use the new method from v1.1!
        return new Fourth().getMessage(true).toUpperCase();
    }
}
