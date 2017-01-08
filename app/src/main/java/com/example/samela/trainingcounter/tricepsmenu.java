package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 8.1.2017.
 */

public class tricepsmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tricepsmenu);

        Button bandskullcrusher = (Button) findViewById(R.id.bandskullcrusher);
        bandskullcrusher.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(tricepsmenu.this, bandskullcrusher.class);
                startActivityForResult(intent, 0);}});

        Button benchdips = (Button) findViewById(R.id.benchdips);
        benchdips.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(tricepsmenu.this, benchdips.class);
                startActivityForResult(intent, 0);}});

        Button benchpresspowerlifting = (Button) findViewById(R.id.benchpresspowerlifting);
        benchpresspowerlifting.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(tricepsmenu.this, benchpresspowerlifting.class);
                startActivityForResult(intent, 0);}});

        Button benchpresswithchains = (Button) findViewById(R.id.benchpresswithchains);
        benchpresswithchains.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(tricepsmenu.this, benchpresswithchains.class);
                startActivityForResult(intent, 0);}});

        Button boardpress = (Button) findViewById(R.id.boardpress);
        boardpress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(tricepsmenu.this, boardpress.class);
                startActivityForResult(intent, 0);}});
    }
}
