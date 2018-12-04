package com.pennyana.dnd;

import android.util.Log;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DataController {
    GameNight gameNight;
    User currentUser;

    /*public void DataController(Users) {
    http://157.201.194.254/~clairehaderlie/hold/gameNight.txt
    */

    /**
     * Read in the game night information from the database.
     */
    public void loadUser() {
        StringBuilder resultBuilder = new StringBuilder();


        try {
        URL infoURL = new URL("http://157.201.194.254/~clairehaderlie/hold/userInfo.txt");

        HttpURLConnection infoConnection = (HttpURLConnection) infoURL.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(infoConnection.getInputStream()));

        String inputLine;


        while ((inputLine = in.readLine()) != null) {
            resultBuilder.append(inputLine);
        }
        in.close();
        return;
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

            HttpURLConnection infoConnection = (HttpURLConnection) infoURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(infoConnection.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                resultBuilder.append(inputLine);
            }
            in.close();
            return;
        }
        catch(Exception e){
            e.printStackTrace();
            Log.e("DATACONTROLLER", "Exception thrown while retrieving Game Night information from database.");
        }
        Log.v("DATACONTROLLER", "From gameNight.txt: " + resultBuilder.toString());
    }


    public void storeUser() {

        //here we will write the user to the database

        return;
    }

    public void storeGameNight() {
        return;
    }

    private void setContentView(int activity_main) {
    }
};
