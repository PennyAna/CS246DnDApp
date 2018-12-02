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
        setContentView(R.layout.main_menu);
    }

    //when the character button is clicked in the main menu
    public void menuCharacter(View random) {
        setContentView(R.layout.character_signup_xml);
    }

    //when the rules button is clicked in the main menu page
    public void menuRules (View random) {
        setContentView(R.layout.main_menu);
    }

}
