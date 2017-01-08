package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 4.1.2017.
 */

public class photosworkout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photosworkout);

        Button pushup = (Button) findViewById(R.id.pushup);
        pushup.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(photosworkout.this, pushup.class);
                startActivityForResult(intent, 0);}});


        Button pushphotos = (Button) findViewById(R.id.photospush);
        pushphotos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(photosworkout.this, pushphotos.class);
                startActivityForResult(intent, 0);}});



}}
