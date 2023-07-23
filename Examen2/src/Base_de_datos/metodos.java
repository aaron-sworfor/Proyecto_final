/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.net.*;
import org.json.*;
public class metodos {
    public String gett(String x) throws MalformedURLException, IOException{
    String apiUrl = x;
    URL url = new URL(apiUrl);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    
    int responseCode = connection.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        
        reader.close();
        return response.toString();
    }
    
    return null;
        
    }
    public void insertar (String x,String y){
         try {
            String url = x; 
            String postData = y;
            URL apiURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
             try (OutputStream outputStream = connection.getOutputStream()) {
                byte[] input = postData.getBytes("utf-8");
                outputStream.write(input, 0, input.length);
            }
             int responseCode = connection.getResponseCode();

            // Close the connection
            connection.disconnect();
            } catch(Exception g)
            {
            }
    }
}
