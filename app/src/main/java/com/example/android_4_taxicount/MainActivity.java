package com.example.android_4_taxicount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText mrate = findViewById(R.id.ET_rate);
        final EditText mdistance = findViewById(R.id.ET_distance);
        final EditText mratemeter = findViewById(R.id.ET_ratemeter);
        final EditText mratemoney = findViewById(R.id.ET_ratemoney);
        final TextView mPrice = findViewById(R.id.TV_price);
        Button mcount = findViewById(R.id.btn_count);
        //計算價格
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double price = 0;
                price = Double.parseDouble(mrate.getText().toString())+(Math.ceil((Double.parseDouble(mdistance.getText().toString()))/Double.parseDouble(mratemeter.getText().toString())))*Double.parseDouble(mratemoney.getText().toString());
                mPrice.setText("價格："+price);
            }
        });
    }
}