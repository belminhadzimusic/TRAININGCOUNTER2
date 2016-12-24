package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 17.12.2016.
 */

public class options extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        Button stopwatch = (Button) findViewById(R.id.stopwatch);
        stopwatch.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(options.this, stopwatch.class);
                startActivityForResult(intent, 0);


        Button pushup = (Button) findViewById(R.id.pushup);
        pushup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, pushup.class);
                startActivityForResult(intent, 0);


        Button abs = (Button) findViewById(R.id.abs);
        abs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, abs.class);
                startActivityForResult(intent, 0);



            }
        });
    }
});}});}}
