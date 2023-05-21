package com.example.tickets;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class TicketRegistration extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_registration);
        Intent intent = getIntent();
        String id = intent.getStringExtra("keyIdButton");
        System.out.println(id);
        TextView text = findViewById(R.id.description);
        double passenger_id = (Math.random()*((999999-100000)+1))+100000;
        switch(id){
            case "2131230819":
                text.setText(R.string.ukok);
                break;
            case "2131230820":
                text.setText(R.string.artibash);
                break;
            case "2131230818":
                text.setText(R.string.goldenring);
                break;
        }
    }
}
