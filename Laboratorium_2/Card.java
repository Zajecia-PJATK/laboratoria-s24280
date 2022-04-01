package com.company;

enum karta_numer {
    JEDYNKA, DWÓJKA, TRÓJKA, CZWÓRKA, PIĄTKA, SZÓSTKA, SIÓDEMKA, ÓSEMKA, DZIEWIĄTKA, DZIESĄTKA, WALET, KRÓLOWA, KRÓL, AS;
}

enum karta_znak {
    KIER, KARO, PIK, TREFL;
}

class Card {
    private karta_numer numer;
    private karta_znak znak;

    public Card(karta_numer numer, karta_znak znak) {
        this.numer = numer;
        this.znak = znak;
    }

    @Override
    public String toString() {
        return "Karta: " + numer + " " + znak;
    }
}

class Main {
    public static void main(String[] args) {
        Card karta1 = new Card(karta_numer.JEDYNKA, karta_znak.KARO);
        System.out.println(karta1);

        Card karta2 = new Card(karta_numer.AS, karta_znak.TREFL);
        System.out.println(karta2);

        Card karta3 = new Card(karta_numer.ÓSEMKA, karta_znak.PIK);
        System.out.println(karta3);
    }
}
