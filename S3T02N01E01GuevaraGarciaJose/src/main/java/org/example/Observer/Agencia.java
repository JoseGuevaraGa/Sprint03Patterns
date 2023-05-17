package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Agencia implements Subject{
    private String name;
    private int acciones;
    private int accionesAnteriores;

    public Agencia(String name, int acciones) {
        this.name = name;
        this.acciones = acciones;
    }

    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> {System.out.println("Aviso Observer");
        observer.update("Bolsa precio anterior: " + this.accionesAnteriores + " Precio actual: " +this.acciones);
        });
    }
    public void subeBolsa(int acciones){
        this.accionesAnteriores = this.acciones;
        this.acciones += acciones;
        notifyObserver();
    }

    public void bajaBolsa(int acciones){
        this.accionesAnteriores = this.acciones;
        this.acciones -= acciones;
        notifyObserver();
    }
}
