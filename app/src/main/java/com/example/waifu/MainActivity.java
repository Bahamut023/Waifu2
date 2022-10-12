package com.example.waifu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Run_Tasks = findViewById(R.id.run_tasks);
        ImageButton Run_Notes = findViewById(R.id.run_notes);
        ImageButton Run_Main = findViewById(R.id.run_main);
        Run_Main.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        Run_Tasks.setOnClickListener(view -> {
            Intent intent = new Intent(this, Tasks.class);
            startActivity(intent);
            finish();
        });
        Run_Notes.setOnClickListener(view -> {
            Intent intent = new Intent(this, Notes.class);
            startActivity(intent);
            finish();
        });
        TextView tv = findViewById(R.id.date);

        Date cal = Calendar.getInstance().getTime();
        String dt = cal.toLocaleString();
        tv.setText(dt);
    }
}