package com.example.waifu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes);

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
    }
}