package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 5.1.2017.
 */

public class stepmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepmenu);



        Button step = (Button) findViewById(R.id.step);
        step.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(stepmenu.this, step.class);
                startActivityForResult(intent, 0);
            }});
        Button stepphotos = (Button) findViewById(R.id.stepphotos);
        stepphotos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(stepmenu.this, stepphotos.class);
                startActivityForResult(intent, 0);
            }});
}}
