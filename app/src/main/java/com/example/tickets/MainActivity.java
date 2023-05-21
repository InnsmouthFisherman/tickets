package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b3 = findViewById(R.id.button3);
        Button b2 = findViewById(R.id.button2);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(listener);
        b2.setOnClickListener(listener);
        b3.setOnClickListener(listener);

    }
    private final View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this , TicketRegistration.class);
            String id = String.valueOf(view.getId());
            intent.putExtra("keyIdButton", id);
            startActivity(intent);
        }
    };
}