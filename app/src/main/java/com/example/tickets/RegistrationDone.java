package com.example.tickets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationDone extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_registration_done);
        TextView done = findViewById(R.id.done);
        Intent intent = getIntent();
        String rout = intent.getStringExtra("rout");
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");
        String passenger_id = intent.getStringExtra("passenger_id");
        String price = String.valueOf(intent.getIntExtra("price", 0));
        done.setText("Маршрут: " + rout + "\n" + "Дата: " + date + "\n" + "Время: " + time + "\n" + "Ваш идентификатор: " + passenger_id + "\n" + "Цена: " + price);

    }
}
