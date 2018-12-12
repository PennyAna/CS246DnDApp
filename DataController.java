package org.haderlie.claire.dundrag;

import android.util.Log;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DataController {
    GameNight gameNight;
    User currentUser;

    /*public void DataController(Users) {

     */

    public void setCurrentUser(User user){
        currentUser = user;
    }
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
            return;
        } catch (Exception exp) {
            exp.printStackTrace();
            Log.e("DATACONTROLLER", "Exception thrown while retrieving User information from database.");
        }
        Log.v("DATACONTROLLER", "From userInfo.txt: " + resultBuilder.toString());

        currentUser.setFirstName("John");
        currentUser.setLastName("Doe");
        currentUser.setPassHash("H@$hB40Wn");
        currentUser.setIsSignedUp(false);
        currentUser.setPassword("G00dPassw0rd");
        currentUser.setSalt("$3@$@17");
        currentUser.setHashedPassword("h@$h$t4ing");
    }

    /**
     * Read in the game night information from the database.
     */
    public void loadGameNight() {
        // String data = "";
        StringBuilder data = new StringBuilder();

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

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (Exception e) {
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
        //Here we will write the gameNight information to the database
        return;
    }

    private void setContentView(int activity_main) {
    }
};
