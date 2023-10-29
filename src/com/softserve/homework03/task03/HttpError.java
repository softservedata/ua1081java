package com.softserve.homework03.task03;

public class HttpError {
    private final int error;
    public static HttpError BADREQUEST = new HttpError(400);
    public static HttpError UNAUTHORIZED = new HttpError(401);
    public static HttpError PAYMENTREQUIRED = new HttpError(402);
    public static HttpError FORBIDDEN = new HttpError(403);
    public static HttpError NOTFOUND = new HttpError(404);

    private HttpError(int error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "HttpError{" +
                "error=" + error +
                '}';
    }
}
