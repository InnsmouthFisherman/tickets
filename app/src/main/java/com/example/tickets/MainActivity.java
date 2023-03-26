package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] routes = { "Горно-Алтайск - Артыбаш", "Золотое Кольцо Алтая", "Укок - Аргут"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, routes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {

        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View view) {
            Spinner s = findViewById(R.id.spinner);
            EditText def = findViewById(R.id.d);
            EditText old = findViewById(R.id.o);
            EditText child = findViewById(R.id.c);
            int d = Integer.parseInt(def.getText().toString());
            int o = Integer.parseInt(old.getText().toString());
            int c = Integer.parseInt(child.getText().toString());
            String rout = s.getSelectedItem().toString();

            switch (rout) {
                case "Горно-Алтайск - Артыбаш": {
                    Ticket a = new Ticket.ATicket('d');
                    d = d * a.price;
                    Ticket b = new Ticket.ATicket('c');
                    c = c * b.price;
                    Ticket x = new Ticket.ATicket('o');
                    o = o * x.price;
                    TextView result = findViewById(R.id.result);
                    result.setText("Итого: \n Детские билеты: " + c + "\n Взрослые билеты" + d + "\n Билеты для пенсионеров: " + o + "\n Дата поездки: " + a.date + "\n Время поездки: " + a.time);

                    break;
                }
                case "Золотое Кольцо Алтая": {
                    Ticket a = new Ticket.ZTicket('d');
                    d = d * a.price;
                    Ticket b = new Ticket.ZTicket('c');
                    c = c * b.price;
                    Ticket x = new Ticket.ZTicket('o');
                    o = o * x.price;
                    TextView result = findViewById(R.id.result);
                    result.setText("Итого: \n Детские билеты: " + c + "\n Взрослые билеты" + d + "\n Билеты для пенсионеров: " + o + "\n Дата поездки: " + a.date + "\n Время поездки: " + a.time);

                    break;
                }
                case "Укок - Аргут": {
                    Ticket a = new Ticket.UTicket('d');
                    d = d * a.price;
                    Ticket b = new Ticket.UTicket('c');
                    c = c * b.price;
                    Ticket x = new Ticket.UTicket('o');
                    o = o * x.price;
                    TextView result = findViewById(R.id.result);
                    result.setText("Итого: \n Детские билеты: " + c + "\n Взрослые билеты" + d + "\n Билеты для пенсионеров: " + o + "\n Дата поездки: " + a.date + "\n Время поездки: " + a.time);

                    break;
                }
            }
        }
    };

}