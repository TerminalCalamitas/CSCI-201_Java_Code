package edu.unca.csci201;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckIfLive {

    public static void main(String[] args) {
        String username = "cakejumper";
        checkIfLive(username);
    }

    public static void checkIfLive(String username) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://twitch.tv/" + username))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String sourceCode = response.body();

            if (sourceCode.contains("isLiveBroadcast")) {
                System.out.println(username + " is live");
            } else {
                System.out.println(username + " is not live");
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
