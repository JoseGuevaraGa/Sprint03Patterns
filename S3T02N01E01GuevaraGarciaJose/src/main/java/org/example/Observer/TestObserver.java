package org.example.Observer;

public class TestObserver {
    public static void main(String[] args) {

        Bolsa bolsa = new Bolsa();
        Agencia a1 = new Agencia("Barcelona", 100);
        a1.addObserver(bolsa);
        a1.subeBolsa(20);

        Agencia a2 = new Agencia("Madrid", 10);
        a2.addObserver(bolsa);
        a2.subeBolsa(5);

        Agencia a3 = new Agencia("Sevilla", 50);
        a3.addObserver(bolsa);
        a3.bajaBolsa(10);
    }
}