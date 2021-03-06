package rip.kevin.heapminecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HeapConnector {
    private final String appId;

    public HeapConnector(String appId) {
        this.appId = appId;
    }

    public void track(String eventName, String playerName, String eventProps) throws IOException {

//        System.out.println(eventProps);
        URL url = new URL("https://heapanalytics.com/api/track");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);


        String body = "{ \"app_id\": \"" + appId + "\", \"identity\": \"" + playerName + "\", \"event\": \"" + eventName + "\", \"properties\": " + eventProps + " }";

        try (OutputStream os = con.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }
}
