package org.example.composite;

public class Soldado implements Unidade{
    private int poder;

    public Soldado(int poder) {
        this.poder = poder;
    }

    @Override
    public int getPoderDeAtaque() {
        return poder;
    }
}
