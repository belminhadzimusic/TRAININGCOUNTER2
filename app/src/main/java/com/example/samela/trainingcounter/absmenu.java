package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 5.1.2017.
 */

public class absmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absmenu);

        Button abs = (Button) findViewById(R.id.abs);
        abs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(absmenu.this, abs.class);
                startActivityForResult(intent,0);
            }
        });

        Button absphotos = (Button) findViewById(R.id.absphotos);
        absphotos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(absmenu.this, absphotos.class);
                startActivityForResult(intent,0);
            }
        });
}}
