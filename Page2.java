package com.example.michael.dispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 4/2/16.
 */
public class Page2 extends AppCompatActivity {

    Button _next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        _next = (Button) findViewById(R.id.next);

        _next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),Page3.class);
                startActivity(k);
            }
        });

    }


}
