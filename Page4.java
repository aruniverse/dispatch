package com.example.michael.dispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 4/2/16.
 */
public class Page4 extends AppCompatActivity {

    Button _back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);

        _back = (Button) findViewById(R.id.back);

        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),MainActivity.class);
                startActivity(k);
            }
        });



    }


}


