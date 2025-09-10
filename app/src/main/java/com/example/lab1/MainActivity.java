package com.example.lab1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvTextChange;
    Button changeColourButton;
    Button changeBackColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.tvTextChange = findViewById(R.id.tvTextChange);
        this.changeColourButton = findViewById(R.id.btnChangeColour);
        changeColourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvTextChange != null) {
                    tvTextChange.setTextColor(Color.GREEN);
                }
            }
        });
        //Branch changes
        this.changeBackColor = findViewById(R.id.btnChangeBackground);
        changeBackColor.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                tvTextChange.setBackgroundColor(Color.RED);
            }
        });
    }

    public void onBtnTextChangeClk(View view) {
        tvTextChange.setText("Button Clicked!");
    }
}