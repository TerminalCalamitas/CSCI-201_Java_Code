package us.TermialCalamitas.Oauth;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TwitchOAuthManager {
    private static final String TWITCH_CLIENT_ID = "YOUR_CLIENT_ID";
    private static final String TWITCH_CLIENT_SECRET = "YOUR_CLIENT_SECRET";
    private static final String TOKEN_FILE = "twitch_token_"
            + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + ".properties";


    public static void main(String[] args) {
        TwitchOAuthManager manager = new TwitchOAuthManager();
        String token = manager.retrieveOrRefreshToken();
        System.out.println("Access Token: " + token);
    }

    public String retrieveOrRefreshToken() {
        Properties properties = loadTokenProperties();
        String token = properties.getProperty("access_token");
        long expirationTimestamp = Long.parseLong(properties.getProperty("expires_at", "0"));

        if (System.currentTimeMillis() > expirationTimestamp) {
            token = requestNewToken();
            properties.setProperty("access_token", token);
            properties.setProperty("expires_at", String.valueOf(calculateExpirationTimestamp()));
            saveTokenProperties(properties);
        }

        return token;
    }

    private String requestNewToken() {
        try {
            String urlString = "https://id.twitch.tv/oauth2/token"
                    + "?client_id=" + TWITCH_CLIENT_ID
                    + "&client_secret=" + TWITCH_CLIENT_SECRET
                    + "&grant_type=client_credentials";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // Parse the response to extract the access token
                // You can use a JSON library to make this easier
                // For simplicity, we assume the response is in JSON format
                String jsonResponse = response.toString();
                int startIndex = jsonResponse.indexOf("access_token") + 15;
                int endIndex = jsonResponse.indexOf("\"", startIndex);
                return jsonResponse.substring(startIndex, endIndex);
            } else {
                System.err.println("Error while obtaining token. Response Code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private long calculateExpirationTimestamp() {
        // Assuming a token is valid for 3600 seconds (1 hour)
        return System.currentTimeMillis() + 3600 * 1000;
    }

    private Properties loadTokenProperties() {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(TOKEN_FILE)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private void saveTokenProperties(Properties properties) {
        try (OutputStream output = new FileOutputStream(TOKEN_FILE)) {
            properties.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
