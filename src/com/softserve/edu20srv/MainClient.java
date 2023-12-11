package com.softserve.edu20srv;

import java.net.URI;
import java.net.http.*;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.concurrent.Flow;

public class MainClient {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest.BodyPublisher body = HttpRequest.BodyPublishers.ofString("aaa=bbb");

        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/api/club/1"))
                //.uri(URI.create("http://localhost:8080/"))
                .uri(URI.create("http://localhost:8080/hello?mail=client"))
                //.uri(URI.create("http://localhost:8080/stop"))
                //.GET()
                //.DELETE()
                .POST(body)
                .timeout(Duration.ofMillis(10000L))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            System.out.println("Status Code: " + statusCode);

            HttpHeaders headers = response.headers();
            System.out.println("Response Headers: " + headers);

            String responseBody = response.body();
            System.out.println("Response Body: " + responseBody);
        } catch (Exception e) {
            System.out.println("Error during request execution: " + e.getMessage());
        }
    }
}
