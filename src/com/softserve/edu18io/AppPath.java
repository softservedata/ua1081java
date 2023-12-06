package com.softserve.edu18io;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppPath {
    public static void main(String[] args) throws Exception {
        // /*
        String uribase = "file:///C:/Tools/1/test.txt";
        URI uri = new URI(uribase);
        System.out.println("uri = " + uri);
        Path path = (Path) Paths.get(uri);
        //
        //String uribase = "C://Intel//javaProjects///ua1081java///";
        //Path path = (Path) Paths.get(uribase);
        //
        System.out.println(path);
        // */
        //
        /*
        Path path = Paths.get(URI.create("file:///tutorial/Java/JavaFX/Topic.txt"));
        System.out.println(path);
        //
        path = Paths.get(URI.create("file:///C:/tutorial/Java/JavaFX/Topic.txt"));
        System.out.println(path);
        */
    }
}