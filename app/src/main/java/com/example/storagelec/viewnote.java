package com.example.storagelec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class viewnote extends AppCompatActivity {

    TextView title,body;
    String T,B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewnote);
        title = findViewById(R.id.textviewtitle);
        body = findViewById(R.id.textviewbody);
        T = getIntent().getStringExtra("title");
        B= getIntent().getStringExtra("body");
        title.setText(T);
        body.setText(B);

    }
}