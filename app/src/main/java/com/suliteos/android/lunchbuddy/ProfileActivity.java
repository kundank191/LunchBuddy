package com.suliteos.android.lunchbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This activity will take a bundle from an Intent and display a users profile
 * the profile can be of the current user , or a user from the list displayed on the screen
 * TODO: Design its XML file with all the necessary fields
 */
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
