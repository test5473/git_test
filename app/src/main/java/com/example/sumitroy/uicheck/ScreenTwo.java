package com.example.sumitroy.uicheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScreenTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(8000);

                    Intent intent=new Intent(getApplicationContext(),ScreenThree.class);
                    startActivity(intent);
                    finish();



                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
