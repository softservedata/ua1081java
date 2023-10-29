package com.softserve.homework04.ex3;

public enum HTTPErrors {
    CODE400("Bad Request Error"),
    CODE401("Unauthorized"),
    CODE402("Payment Request"),
    CODE403("Forbidden"),
    CODE404("Not Found"),
    CODE405("Method Not Allowed"),
    CODE406("Not Acceptable"),
    CODE407("Proxy Authentication Required");

    private final String description;

    HTTPErrors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

