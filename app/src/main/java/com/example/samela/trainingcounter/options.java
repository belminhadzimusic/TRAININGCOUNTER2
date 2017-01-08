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
                startActivityForResult(intent, 0);}});


        Button photosworkout = (Button) findViewById(R.id.photosworkout);
        photosworkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, photosworkout.class);
                startActivityForResult(intent, 0);
            }});

        Button tricepsmenu = (Button) findViewById(R.id.tricepsmenu);
        tricepsmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, tricepsmenu.class);
                startActivityForResult(intent, 0);
            }});


        Button stepmenu = (Button) findViewById(R.id.stepmenu);
        stepmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, stepmenu.class);
                startActivityForResult(intent, 0);
            }});
        Button bicepsmenu = (Button) findViewById(R.id.bicepsmenu);
        bicepsmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, bicepsmenu.class);
                startActivityForResult(intent, 0);
            }});
        Button chestmenu = (Button) findViewById(R.id.chestmenu);
        chestmenu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(options.this, chestmenu.class);
                startActivityForResult(intent, 0);}});

         Button absmenu = (Button) findViewById(R.id.absmenu);
         absmenu.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Intent intent = new Intent(options.this, absmenu.class);
                 startActivityForResult(intent,0);
             }
         });

        Button diet = (Button) findViewById(R.id.diet);
        diet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(options.this, diet.class);
                startActivityForResult(intent,0);
            }
        });


       }


}
