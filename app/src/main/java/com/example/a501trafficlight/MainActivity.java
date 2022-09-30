package com.example.a501trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView redlight;
    TextView yellowlight;
    TextView greenlight;
    Button buttton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redlight = findViewById(R.id.redlight);
        yellowlight = findViewById(R.id.yellowlight);
        greenlight = findViewById(R.id.greenlight);
        buttton = findViewById(R.id.button);
        redlight.setText("light");
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!redlight.getText().equals("")){
                    yellowlight.setText("hey");
                    redlight.setText("");
                    greenlight.setText("");
                }
                else if (!yellowlight.getText().equals("")){
                    greenlight.setText("hey");
                    yellowlight.setText("");
                    redlight.setText("");
                }
                else if (!greenlight.getText().equals("")){
                    redlight.setText("hey");
                    greenlight.setText("");
                    yellowlight.setText("");
                }
            }
        });
    }
}