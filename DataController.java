package com.alex.j.cs246dd;


import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DataController {
    private GameNight gameNight;
    private User currentUser;

    public GameNight getGameNight() {
        return gameNight;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    /*public void DataController(Users) {
    http://157.201.194.254/~clairehaderlie/hold/gameNight.txt
    */

    /**
     * Read in the game night information from the database.
     */
    public void loadUser() {
        StringBuilder resultBuilder = new StringBuilder();


        try {

        URL infoURL = new URL("https://niclairex.com/userData.txt");


        HttpURLConnection infoConnection = (HttpURLConnection) infoURL.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(infoConnection.getInputStream()));

        String inputLine;


        while ((inputLine = in.readLine()) != null) {
            resultBuilder.append(inputLine);
        }
        in.close();
    }
    catch(Exception exp){
        exp.printStackTrace();
        Log.e("DATACONTROLLER", "Exception thrown while retrieving User information from database.");
    }
        Log.v("DATACONTROLLER", "From userInfo.txt: " + resultBuilder.toString());
    }

    /**
     * Read in the game night information from the database.
     *
     */
    public void loadGameNight() {
        StringBuilder resultBuilder = new StringBuilder();
        try {
            URL infoURL = new URL("http://157.201.194.254/~clairehaderlie/hold/gameNight.txt");

        StringBuilder resultBuilder = new StringBuilder();
        try {

            URL weatherURL = new URL("https://www.com/gameNightData.txt");
            HttpURLConnection theConnection = (HttpURLConnection) weatherURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(theConnection.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                resultBuilder.append(inputLine);
            }
            in.close();

        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
            Log.e("DATACONTROLLER", "Exception thrown while retrieving Game Night information from database.");
        }

        Log.v("DATACONTROLLER", "From gameNight.txt: " + resultBuilder.toString());
    }


    public void storeUser() {

        //here we will write the user to the database

    }

    public void storeGameNight() {
        //Here we will write the gameNight information to the database
        return;
    }

    private void setContentView(int activity_main) {
    }
}
