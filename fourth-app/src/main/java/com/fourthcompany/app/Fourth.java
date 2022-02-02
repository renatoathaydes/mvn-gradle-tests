package com.fourthcompany.app;

public class Fourth {
    public String getMessage() { return "hello"; }

    // new in 1.1 (semver OK)
    public String getMessage(boolean arriving) {
        return arriving ? "hello" : "bye";
    }

}
