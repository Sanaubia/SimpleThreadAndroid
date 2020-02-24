package com.example.androidthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Handler mainHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startThread(View v){
      LoopThread loop = new LoopThread();
      new Thread(loop).start();
    }

    public void stopThread(View v){


    }

    public void stopApp(View v){


    }

    class LoopThread implements Runnable{
        @Override
        public void run() {
            String teksti = "Tiisu, we want more!";
            while(true){
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
                Log.i("LOGIAAAAAAAAAAAAAAAAAA******************* ",teksti);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
