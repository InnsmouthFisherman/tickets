package com.example.tickets;

public class Ticket {
    int tickets=1;
    int child_tickets=0;
    double id;
    int price;
    String date;
    String time;
    public static class ATicket extends Ticket {

        public ATicket(int child_tickets, int tickets, double id) {
            this.date = "7.00 1 июня";
            this.time = "4 часа 30 минут";
            this.price = tickets * 30 + child_tickets * 15;
            this.id = id;
        }
    }
    public static class ZTicket extends Ticket {
        public ZTicket(int child_tickets, int tickets, double id) {
            this.date = "8.00 12 августа";
            this.time = "14 часов 30 минут";
            this.price = tickets * 40 + child_tickets * 15;
            this.id = id;
        }
    }

    public static class UTicket extends Ticket {
        public UTicket(int child_tickets, int tickets, double id) {
            this.date = "10.30 10 июня";
            this.time = "7 часов";
            this.price = tickets * 20 + child_tickets * 20;
            this.id = id;
        }
    }
}