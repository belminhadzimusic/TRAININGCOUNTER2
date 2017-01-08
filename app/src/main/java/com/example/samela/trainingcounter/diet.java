package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 4.1.2017.
 */

public class diet extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet);

        Button diet1 = (Button) findViewById(R.id.diet1);
        diet1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(diet.this, diet1.class);
                startActivityForResult(intent, 0);}});
        Button day1 = (Button) findViewById(R.id.day1);
        day1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day1.class);
                startActivityForResult(intent, 0);}});
        Button day2 = (Button) findViewById(R.id.day2);
        day2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day2.class);
                startActivityForResult(intent, 0);
            }});
        Button day3 = (Button) findViewById(R.id.day3);
        day3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day3.class);
                startActivityForResult(intent, 0);
            }});
        Button day4 = (Button) findViewById(R.id.day4);
        day4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day4.class);
                startActivityForResult(intent, 0);
            }});
        Button day5 = (Button) findViewById(R.id.day5);
        day5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day5.class);
                startActivityForResult(intent, 0);
            }});
        Button day6 = (Button) findViewById(R.id.day6);
        day6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day6.class);
                startActivityForResult(intent, 0);
            }});
        Button day7 = (Button) findViewById(R.id.day7);
        day7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(diet.this, day7.class);
                startActivityForResult(intent, 0);
            }});
}}
