package com.example.sms;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     SmsManager sms;
     testBroad br;
    private EditText phone,text;
    private Button bt,bt2,bt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        phone = (EditText) findViewById(R.id.et1);
        text = (EditText)  findViewById(R.id.et2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phone.setText("");
                text.setText("");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sms = SmsManager.getDefault();
                String p = phone.getText().toString();
                String t = text.getText().toString();
                sms.sendTextMessage(p,null,t,null,null);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
    }
}