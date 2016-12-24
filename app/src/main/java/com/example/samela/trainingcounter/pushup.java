package com.example.samela.trainingcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Samela on 17.12.2016.
 */

public class pushup extends Activity {


    Button btntouch;
    Button btnreset;

    TextView txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushup);

        btntouch = (Button) findViewById(R.id.buttonTouch);
        btnreset = (Button) findViewById(R.id.buttonReset);

        txtCount = (TextView) findViewById(R.id.textViewCount);

        btntouch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                String countValue= txtCount.getText().toString();

                int intCountValue = Integer.parseInt(countValue);
                intCountValue++;

                txtCount.setText(String.valueOf(intCountValue));
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCount.setText(String.valueOf(0));
            }
        });

    }
}
