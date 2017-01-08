package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samela on 8.1.2017.
 */

public class bicepsmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bicepsmenu);

        Button alternatehammercurl = (Button) findViewById(R.id.alternatehammercurl);
        alternatehammercurl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bicepsmenu.this, alternatehammercurl.class);
                startActivityForResult(intent, 0);
            }});
        Button alternateinclinedumbbellcurl = (Button) findViewById(R.id.alternateinclinedumbbellcurl);
        alternateinclinedumbbellcurl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bicepsmenu.this, alternateinclinedumbbellcurl.class);
                startActivityForResult(intent, 0);
            }});

        Button barblecurl = (Button) findViewById(R.id.barblecurl);
        barblecurl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bicepsmenu.this, barblecurl.class);
                startActivityForResult(intent, 0);
            }});

        Button barblecurlslyingagainstanincline = (Button) findViewById(R.id.barblecurlslyingagainstanincline);
        barblecurlslyingagainstanincline.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bicepsmenu.this, barblecurlslyingagainstanincline.class);
                startActivityForResult(intent, 0);
            }});
        Button bicepscurltoshoulderpress = (Button) findViewById(R.id.bicepscurltoshoulderpress);
        bicepscurltoshoulderpress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bicepsmenu.this, bicepscurltoshoulderpress.class);
                startActivityForResult(intent, 0);
            }});
    }
}
