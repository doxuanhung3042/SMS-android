package com.example.sms;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class testBroad extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"ban vua bật tắt chế độ máy bay",Toast.LENGTH_SHORT).show();

    }
}
