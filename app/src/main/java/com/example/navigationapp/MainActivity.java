package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Process : memory, stack table
        // Thread : runs the code

        // Default android application runs on the main thread (UI Thread)
        // create a second thread and run this code on that second thread
                // getProfileInfoFromTheNet(); // 10 seconds

        /// ~~~~      UI Thread
        //// ~~~~~~   second thread ~~~~~~~ callBackFunction()
        // Log.i
        // display and image


        // resource A, resource B
        // t1 and t2
        // t1 tries to rw A
        // t2 tries to rw A
        // t1 only finishes when B is free
        // t2 need A to finish B

        // concurrency problems
        // t1 reads A
        // t2 modifies B
        // t1 saves old data in A
    }
}