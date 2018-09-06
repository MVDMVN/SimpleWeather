package com.example.mvdmvn.simpleweather.Services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class WeatherService extends Service {

    private static final String TAG = "Services/WeatherService";

    public static final String EXTRA_COUNT_TO = "count_to";

    private int countTo;
    private int currentNumber = 0;

    @Nullable
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        countTo = intent.getIntExtra(EXTRA_COUNT_TO, 0);

        startCount();

        return START_STICKY;
    }

    private void startCount() {
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {

                currentNumber++;

                Log.i(TAG, "Current number: " + currentNumber);

                if (currentNumber < countTo) {
                    handler.postDelayed(this, 1000);
                }

            }
        });
    }
}
