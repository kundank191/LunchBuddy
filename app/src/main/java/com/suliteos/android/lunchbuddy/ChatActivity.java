package com.suliteos.android.lunchbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is the chat activity , users can chat amongst themselves and decide the venue , date and time
 */

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
}
