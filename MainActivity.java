package com.example.michael.dispatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = (Button) findViewById(R.id.start);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),Page2.class);
                startActivity(k);
            }
        });

    }
}
