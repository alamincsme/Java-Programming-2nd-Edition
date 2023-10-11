package com.alamin.practice;
import java.io.*;
import java.net.*;

public class WebPageDownloader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter URL:  ");

        try {
            String urlString = reader.readLine();
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();


                 String fileName = "web_page_content.html";
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                 writer.write(content.toString());
                 writer.close();

                System.out.println("Web page is saved.!");
            } else {
                throw new IOException("web page is not access. , responce code : " + responseCode);
            }
        } catch (MalformedURLException e) {
            System.out.println("invalid url formate: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Network Error ! : " + e.getMessage());
        }
    }
}
