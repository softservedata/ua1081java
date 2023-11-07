package com.softserve.homework03.task03;
//Your task is to create an enum HttpError, which represents the information about
public enum HttpError {
    BADREQUEST(400),
    UNAUTHORIZED(401),
    PAYMENTREQUIRED(402),
    FORBIDDEN(403),
    NOTFOUND(404);

    private final int error;
    HttpError(int error) {
        this.error = error;
    }

    public int getError() {
        return error;
    }
    @Override
    public String toString() {
        return "HttpError{" +
                "error=" + error +
                '}';
    }

}
