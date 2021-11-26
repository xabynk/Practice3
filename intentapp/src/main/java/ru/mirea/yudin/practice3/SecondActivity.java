package ru.mirea.yudin.practice3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String date = (String) getIntent().getSerializableExtra("date");
        TextView textView = findViewById(R.id.textView);
        textView.setText(date);
    }
}