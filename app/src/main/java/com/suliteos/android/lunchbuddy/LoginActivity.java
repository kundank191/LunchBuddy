package com.suliteos.android.lunchbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This activity will display a login screen it will allow user to create account or login
 * from an existing account , it will use google login , facebook login and maybe a phone number login like whatsapp
 * this is a new google login we can try this : https://developers.google.com/identity/one-tap/web/overview
 * or we can use firebase login
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
