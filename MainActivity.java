package com.alex.j.cs246dd;

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
        setContentView(R.layout.character_edit_xml);
        return;
    }

}
