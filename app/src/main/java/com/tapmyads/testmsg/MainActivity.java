package com.tapmyads.testmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tapmyads.tostttt.CheckMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckMessage.PrintMessage();
    }
}