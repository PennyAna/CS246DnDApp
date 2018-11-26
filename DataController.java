package org.haderlie.claire.danddapp;

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

    public void loadUser() {
        StringBuilder resultBuilder = new StringBuilder();
        try {
        URL infoURL = new URL("http://157.201.194.254/~clairehaderlie/hold/userInfo.txt");

        HttpURLConnection infoConnection = (HttpURLConnection) infoURL.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(infoConnection.getInputStream()));

        String inputLine;


        while ((inputLine = in.readLine()) != null) {
            if (Thread.interrupted()) {
                return;
            }
            resultBuilder.append(inputLine);
        }
        in.close();
        return;
    }
    catch(Exception e){
        e.printStackTrace();
    }
        Log.v("DATA CONTROLLER", "From gameNight.txt: " + resultBuilder.toString());
    }

    public void loadGameNight() {
        StringBuilder resultBuilder = new StringBuilder();
        try {
            URL infoURL = new URL("http://157.201.194.254/~clairehaderlie/hold/gameNight.txt");

            HttpURLConnection infoConnection = (HttpURLConnection) infoURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(infoConnection.getInputStream()));

            String inputLine;


            while ((inputLine = in.readLine()) != null) {
                if (Thread.interrupted()) {
                    return;
                }
                resultBuilder.append(inputLine);
            }
            in.close();
            return;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Log.v("DATA CONTROLLER", "From gameNight.txt: " + resultBuilder.toString());
    }


    public void storeUser() {
        return;
    }

    public void storeGameNight() {
        return;
    }

    private void setContentView(int activity_main) {
    }
};
