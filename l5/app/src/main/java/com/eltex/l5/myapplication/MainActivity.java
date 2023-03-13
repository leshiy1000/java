package com.eltex.l5.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onStart() {
        super.onStart();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onResume() {
        super.onResume();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onPause() {
        super.onPause();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onStop() {
        super.onStop();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onRestart() {
        super.onRestart();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }

    protected void onDestroy() {
        super.onDestroy();
        System.out.println("@@@@@@@@@@" + (new Throwable()).getStackTrace()[0].toString() + "@@@@@@@@@@");
    }
}