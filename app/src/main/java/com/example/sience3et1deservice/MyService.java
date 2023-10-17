package com.example.sience3et1deservice;

import  android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public int   onStartCommand(Intent intent, int flags, int startId) {
        // Code à exécuter lorsque le service est démarré.
        Toast.makeText(this, "Service démarré"+START_STICKY, Toast.LENGTH_SHORT).show();

   return START_STICKY;


    }
}