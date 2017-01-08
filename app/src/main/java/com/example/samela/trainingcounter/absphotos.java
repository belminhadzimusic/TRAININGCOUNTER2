package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 5.1.2017.
 */

public class absphotos extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absphotos);

        Button situp34 = (Button) findViewById(R.id.situp34);
        situp34.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(absphotos.this, situp34.class);
                startActivityForResult(intent, 0);}});

        Button airbike = (Button) findViewById(R.id.airbike);
        airbike.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(absphotos.this, airbike.class);
                startActivityForResult(intent, 0);}});

        Button heeltoucher = (Button) findViewById(R.id.heeltoucher);
        heeltoucher.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(absphotos.this, heeltoucher.class);
                startActivityForResult(intent, 0);}});

        Button kneerise = (Button) findViewById(R.id.kneerise);
        kneerise.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(absphotos.this, kneerise.class);
                startActivityForResult(intent, 0);}});

        Button bentpress = (Button) findViewById(R.id.bentpress);
        bentpress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(absphotos.this, bentpress.class);
                startActivityForResult(intent, 0);}});
    }
}
