package com.masai.intentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mTvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTvUserName = findViewById(R.id.tvUserName);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        mTvUserName.setText(userName);
    }
}