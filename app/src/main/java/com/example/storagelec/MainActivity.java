/*
package com.example.storagelec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    Button save,load;
    EditText title,body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = findViewById(R.id.btnsave);
        load = findViewById(R.id.btnload);
        title = findViewById(R.id.ettitle);
        body = findViewById(R.id.etbody);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream fo = openFileOutput("myfiledata.txt",MODE_PRIVATE);
                    String s = title.getText().toString();
                    String t = body.getText().toString();
                    JSONObject j = new JSONObject();
                    j.put("title",s);
                    j.put("body",t);
                    String x = j.toString();
                    Log.d("******","*****data saved:"+x);
                    Toast.makeText(getApplicationContext(),"data saved",Toast.LENGTH_LONG).show();
                    fo.write(x.getBytes());
                }
                catch (Exception e)
                {

                }
            }
        });

        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fin = openFileInput("myfiledata.txt");
                   byte[] b = new byte[5000];
                   int count = fin.read(b);
                    String s = new String(b,0,count);
                    Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                    JSONObject j = new JSONObject(s);
                    if(j.has("title"))
                    {
                        title.setText(j.getString("title"));
                    }
                    if(j.has("body"))
                    {
                        body.setText(j.getString("body"));
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}*/

package com.example.storagelec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.storagelec.cache;
import com.example.storagelec.external;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button internal_btn  = findViewById(R.id.internalbtn);
        Button external_btn  = findViewById(R.id.externalbtn);
        Button cache_btn  = findViewById(R.id.cachebtn);


        internal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent internal_screen_intent = new Intent(getApplicationContext(), internal.class);
                startActivity(internal_screen_intent);
            }
        });
        external_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent external_screen_intent = new Intent(getApplicationContext(), external.class);
                startActivity(external_screen_intent);
            }
        });
        cache_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cache_screen_intent = new Intent(getApplicationContext(), cache.class);
                startActivity(cache_screen_intent);
            }
        });
    }
}
