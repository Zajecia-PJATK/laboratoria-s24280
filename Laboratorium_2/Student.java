package com.company;

    class Student {
        String imie;
        String nazwisko;
        String nr_ind;
        double obecnosc;
        int ocena;

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
            if (imie.equals("")) {
                this.imie = "Unknown";
            }
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            if (nazwisko.length() == 0) {
                this.nazwisko = "Unknown";
            } else {
                this.nazwisko = nazwisko;
            }
        }

        public String getNr_ind() {
            return nr_ind;
        }

        public void setNr_ind(String nr_ind) {
            this.nr_ind = nr_ind;
        }

        public double getObecnosc() {
            return obecnosc;
        }

        public void setObecnosc(double obecnosc) {
            this.obecnosc = obecnosc;
        }

        public int getOcena() {
            return ocena;
        }

        public void setOcena(int ocena) {
            this.ocena = ocena;
            if (obecnosc < 50) {
                this.ocena = 2;
            }
        }

        public Student(String imie, String nazwisko, String nr_ind, double obecnosc, int ocena) {
            setImie(imie);
            setNazwisko(nazwisko);
            this.nr_ind = nr_ind;
            this.obecnosc = obecnosc;
            setOcena(ocena);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", nr_ind='" + nr_ind + '\'' +
                    ", obecnosc=" + obecnosc +
                    ", ocena=" + ocena +
                    '}';
        }
    }

    class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Tomasz", "Wasielewski", "24280", 100, 5);
            System.out.println(student1);

            Student student2 = new Student("", "", "11111", 35, 3);
            System.out.println(student2);

            Student student3 = new Student("Jotaro", "Kujo", "42069", 60, 4);
            System.out.println(student3);
        }
    }




