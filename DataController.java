package org.haderlie.claire.dundrag;

import android.util.Log;
import android.widget.EditText;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

    public User getCurrentUser(){
        return currentUser;
    }

    /**
     * Read in the game night information from the database.
     */
    public void loadUserBasics(String username) {

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

            Gson gson = new Gson();
            String userJson = resultBuilder.toString();

          currentUser = gson.fromJson(userJson, User.class);

        } catch (Exception exp) {
            exp.printStackTrace();
            Log.e("DATACONTROLLER", "Exception thrown while retrieving User information from database.");
        }
        Log.v("DATACONTROLLER", "From userInfo.txt: " + resultBuilder.toString());


        //SINCE IT DOESN'T ACTUALLY WORK

        currentUser.setIsSignedUp(false);
        currentUser.setPassword("");
        currentUser.setSalt("");
        currentUser.setHashedPassword("h@$h$t4ing");
    }

    public void loadCompleteUser(String username){
        currentUser.setFirstName("John");
        currentUser.setLastName("Doe");
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

        Gson gson = new Gson();
        String jsonUser = gson.toJson(currentUser, User.class);

        try{
            File file = new File("userData.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file);

            writer.write(jsonUser);
            writer.flush();
            writer.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return;
    }

    public void storeGameNight() {

        Gson gson = new Gson();

        String jsonUser = gson.toJson(gameNight, GameNight.class);
        try{
            File file = new File("gameNightData.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file);

            writer.write(jsonUser);
            writer.flush();
            writer.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    private void setContentView(int activity_main) {
    }
};
