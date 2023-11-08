package com.softserve.homework04.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    TOO_MANY_REQUESTS(429, "Too Many Requests");

    private final int statusCode;
    private final String message;
    private static final Map<Integer, HTTPError> errorMap = new HashMap<Integer, HTTPError>();

    static {
        for (HTTPError httpError : HTTPError.values()) {
            errorMap.put(httpError.getStatusCode(), httpError);
        }
    }
    HTTPError(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public static HTTPError getErrorEnum(int statusCode) {
        return errorMap.get(statusCode);
    }
}

class Implementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the error status code: ");
        int code = scanner.nextInt();
        try {
            String errorMessage = HTTPError.getErrorEnum(code).getMessage();
            System.out.println("Error message: " + errorMessage);
        } catch (NullPointerException e) {
            System.out.println("We do not know anything about the status code " + code + ". Please try again with another one!");
        }
    }
}