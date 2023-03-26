package com.example.tickets;

public class Ticket {
    int price;
    String date;
    String time;
    public static class ATicket extends Ticket{

        public ATicket(char type){
            this.date = "7.00 1 июня";
            this.time = "4 часа 30 минут";
            if (type == 'c') {
                this.price = 35;
            }else if (type == 'o'){
                this.price = 49;
            } else if (type == 'd'){
                this.price = 70;
            }
        }

    }
    public static class ZTicket extends Ticket{

        public ZTicket(char type){
            this.date = "8.00 12 августа";
            this.time = "14 часов 30 минут";
            if (type == 'c') {
                this.price = 50;
            }else if (type == 'o'){
                this.price = 70;
            } else if (type == 'd'){
                this.price = 100;
            }
        }

    }
    public static class UTicket extends Ticket{
        public UTicket(char type){
            this.date = "10.30 10 июня";
            this.time = "7 часов";
            if (type == 'c') {
                this.price = 30;
            }else if (type == 'o'){
                this.price = 42;
            } else if (type == 'd'){
                this.price = 60;
            }
        }

    }
}
