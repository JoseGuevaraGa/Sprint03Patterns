package org.example.Observer;

public class Bolsa implements Observer{

    @Override
    public void update(String mensaje) {
        System.out.println(mensaje);
    }
}
