package com.alex.j.cs246dd;

import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private LoginSecurityHandler loginControl;
    private DataController dataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void handleSignUp(View random){
        setContentView(R.layout.signup);
        return;
    }

    public void handleLogin(View random) {
        setContentView(R.layout.main_menu);
        return;
    }

    //when the tables button is clicked in the main menu
    public void menuTables(View random) {
        setContentView(R.layout.table_draft);
    }

    //when the character button is clicked in the main menu
    public void menuCharacter(View random) {
        setContentView(R.layout.character_signup_xml);
    }

    //when the rules button is clicked in the main menu page
    public void menuRules (View random) {
        setContentView(R.layout.main_menu);
    }

    //when a character needs to be created/edited
    public void editCharacter (View random) {
        setContentView(R.layout.character_edit_xml);
    }

    // to return to main menu
    public void returnToMenu(View random) {
        setContentView(R.layout.main_menu);
    }

    //view a specific table
    public void viewTable (View random) {
        setContentView(R.layout.adventure_draft);
    }

    // delete a character from the user's list of characters
    public void characterDelete (View random) {
        setContentView(R.layout.character_signup_xml);
    }

    //register a new user
    public void signup (View random) {
        setContentView(R.layout.main_menu);
    }

    //save a character
    public void characterSave (View random) {
        setContentView(R.layout.character_signup_xml);
    }

}
