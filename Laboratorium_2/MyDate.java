package com.company;

    class MyDate {
        private int day;
        private int month;
        private int year;

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            if((day < 1) || (day > 31)) {
                this.day = 0;
            }
            else {
                this.day = day;
            }
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            if((month <= 0) || (month > 12)) {
                this.month = 0;
            }
            else {
                this.month = month;
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if ((year <= 1990) || (year > 2050)) {
                this.year = 0;
            }
            else {
                this.year = year;
            }
        }

        public MyDate(int day, int month, int year) {
            setDay(day);
            setMonth(month);
            setYear(year);
        }

        public String displayDate(){
            String day = String.format("%02d", this.day);
            String month = String.format("%02d", this.month);
            String year = String.format("%04d", this.year);
            return day + "/" + month + "/" + year;
        }
    }

    class Main {
        public static void main(String[] args) {
            MyDate date1 = new MyDate(1,5,1996);
            System.out.println(date1.displayDate());

            MyDate date2 = new MyDate(24,11,2022);
            System.out.println(date2.displayDate());

            MyDate date3 = new MyDate(44,33,2051);
            System.out.println(date3.displayDate());
        }
    }
