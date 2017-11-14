package com.fju.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            TextView tvsecret = (TextView) findViewById(R.id.secret);
            Random random = new Random();
            int r = random.nextInt(99) + 1;
            int secret = Integer.parseInt(tvsecret.getText().toString());
            secret = r;
            EditText ednumber = (EditText) findViewById(R.id.number);
            int number = Integer.parseInt(ednumber.getText().toString());
            while (number > secret) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("0~" + number)
                        .show();
                break;
            }
        }

        public void findViews() {
            TextView tvsecret = (TextView) findViewById(R.id.secret);
            TextView tvinfo = (TextView) findViewById(R.id.info);
            EditText ednumber = (EditText) findViewById(R.id.number);
            Button btsend = (Button) findViewById(R.id.send);
        }

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            findViews();
        }

    }
}