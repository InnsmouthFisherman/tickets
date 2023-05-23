package com.example.tickets;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class TicketRegistration extends AppCompatActivity {
    String id;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_registration);
        Intent intent = getIntent();
        id = intent.getStringExtra("keyIdButton");
        TextView text = findViewById(R.id.description);
        switch(id){
            case "2131230819":
                text.setText(R.string.ukok);
            case "2131230820":
                text.setText(R.string.artibash);
            case "2131230818":
                text.setText(R.string.goldenring);
        }
        Button b = findViewById(R.id.confirm);
        b.setOnClickListener(listener);
    }
    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double passenger_id = (Math.random()*((999999-100000)+1))+100000;
            EditText a = findViewById(R.id.tickets);
            EditText b = findViewById(R.id.child_tickets);
            int tickets = Integer.parseInt(a.getText().toString());
            int child_tickets = Integer.parseInt(b.getText().toString());
            Intent intent_ = new Intent(TicketRegistration.this , RegistrationDone.class);
            switch(id){
                case "2131230819":
                    Ticket aticket = new Ticket.UTicket(child_tickets, tickets, passenger_id);
                    intent_.putExtra("rout", "Укок-Аргут");
                    intent_.putExtra("price", aticket.price);
                    intent_.putExtra("date", aticket.date);
                    intent_.putExtra("time", aticket.time);
                    intent_.putExtra("id", aticket.id);
                    break;
                case "2131230820":
                    Ticket bticket = new Ticket.ATicket(child_tickets, tickets, passenger_id);
                    intent_.putExtra("rout", "Артыбаш");
                    intent_.putExtra("price", bticket.price);
                    intent_.putExtra("date", bticket.date);
                    intent_.putExtra("time", bticket.time);
                    intent_.putExtra("id", bticket.id);
                    break;
                case "2131230818":
                    Ticket cticket = new Ticket.ZTicket(child_tickets, tickets, passenger_id);
                    intent_.putExtra("rout", "Золотое Кольцо Алтая");
                    intent_.putExtra("price", cticket.price);
                    intent_.putExtra("date", cticket.date);
                    intent_.putExtra("time", cticket.time);
                    intent_.putExtra("id", cticket.id);
                    break;
            }
            startActivity(intent_);
        }
    };
}
