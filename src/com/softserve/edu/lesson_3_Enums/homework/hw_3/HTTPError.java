package com.softserve.edu.lesson_3_Enums.homework.hw_3;

public enum HTTPError {
    BAD_REQUEST(400,"Bad request"),
    PAYMENT_REQUIRED(402,"Payment required"),
    NOT_FOUND(404,"Not found"),
    NOT_ACCEPTEBLE(406," Not Acceptable"),
    INTERNET_SERVER_ERROR(500,"Internal Server Error"),
    NOT_IMPLEMENTED(501," Not Implemented"),
    BAD_GATEWAY(502," Bad Gateway"),
    HTTP_VERSION_NOT_SUPPORTED(505,"HTTP Version Not Supported");





    private int code;
    private String name;

    HTTPError(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
