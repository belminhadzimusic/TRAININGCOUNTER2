package com.example.samela.trainingcounter;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Samela on 17.12.2016.
 */

public class step extends Activity implements SensorEventListener{

    TextView tv_step;

    SensorManager sensorManager;

    boolean running = false;
    ImageView btnRESET;

    float startSteps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step);

        tv_step =(TextView) findViewById(R.id.tv_step);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        btnRESET = (ImageView) findViewById(R.id.buttonRESET);
        btnRESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSteps = startSteps + Float.valueOf(tv_step.getText().toString());
                tv_step.setText(String.valueOf(0));
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if (countSensor !=null){
            sensorManager.registerListener(this, countSensor, SensorManager.SENSOR_DELAY_UI);
        } else {
            Toast.makeText(this,"Sensor not found", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        running = false;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
       if (running){


           tv_step.setText(String.valueOf(event.values[0] - startSteps));
       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}
