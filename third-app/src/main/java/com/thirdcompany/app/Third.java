package com.thirdcompany.app;
import com.fourthcompany.app.Fourth;

public class Third {
    public String upperCaseMessage() {
        return new Fourth().getMessage().toUpperCase();
    }
}
