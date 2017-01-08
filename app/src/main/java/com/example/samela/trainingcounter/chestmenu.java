package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 8.1.2017.
 */

public class chestmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestmenu);

        Button alternatingfloorpress = (Button) findViewById(R.id.alternatingfloorpress);
        alternatingfloorpress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(chestmenu.this, alternatingfloorpress.class);
                startActivityForResult(intent, 0);}});

        Button aroundtheworlds = (Button) findViewById(R.id.aroundtheworlds);
        aroundtheworlds.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(chestmenu.this, aroundtheworlds.class);
                startActivityForResult(intent, 0);}});

        Button barpushupsmithmachine = (Button) findViewById(R.id.barpushupsmithmachine);
        barpushupsmithmachine.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(chestmenu.this, barpushupsmithmachine.class);
                startActivityForResult(intent, 0);}});

        Button barthrowandpress = (Button) findViewById(R.id.barthrowandpress);
        barthrowandpress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(chestmenu.this, barthrowandpress.class);
                startActivityForResult(intent, 0);}});
        Button barbellbenchpressmediumgrip = (Button) findViewById(R.id.barbellbenchpressmediumgrip);
        barbellbenchpressmediumgrip.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(chestmenu.this, barbellbenchpressmediumgrip.class);
                startActivityForResult(intent, 0);}});

    }
}
