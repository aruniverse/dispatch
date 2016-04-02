package com.example.michael.dispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 4/2/16.
 */
public class Page3 extends AppCompatActivity {

        Button _notify;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.page3);

            _notify = (Button) findViewById(R.id.notify);

            _notify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k  = new Intent(getBaseContext(),Page4.class);
                    startActivity(k);
                }
            });


        }


}

