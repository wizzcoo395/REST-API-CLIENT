import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherClient {

    public static void main(String[] args) {

        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=22.57&longitude=88.36&current_weather=true";

        try {
            // Step 1: Create URL object
            URL url = new URL(apiUrl);

            // Step 2: Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Step 3: Check response code
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                // Step 4: Read response
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );

                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Step 5: Parse JSON
                JSONObject json = new JSONObject(response.toString());
                JSONObject currentWeather = json.getJSONObject("current_weather");

                double temperature = currentWeather.getDouble("temperature");
                double windspeed = currentWeather.getDouble("windspeed");

                // Step 6: Display structured output
                System.out.println("===== Weather Report =====");
                System.out.println("Temperature : " + temperature + " °C");
                System.out.println("Wind Speed  : " + windspeed + " km/h");

            } else {
                System.out.println("HTTP Error Code: " + responseCode);
            }

            // Step 7: Close connection
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
