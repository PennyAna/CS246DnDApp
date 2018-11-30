package com.alex.j.cs246dd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private LoginSecurityHandler loginControl;
    private DataController dataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void handleSignUp(){
        setContentView(R.layout.signup);
        return;
    }

    public void handleLogin() {
        setContentView(R.layout.character_edit_xml);
        return;
    }

}
