package com.softserve.edu18io;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppPath {
    public static void main(String[] args) throws Exception {
        //String uribase = "https://softserve.academy///";
        String uribase = "C://Intel//javaProjects///ua1081java///";
        //URI uri = new URI(uribase);
        //System.out.println("uri = " + uri);
        //Path path = (Path) Paths.ge
        Path path = (Path) Paths.get(uribase);
        System.out.println(path);
    }
}