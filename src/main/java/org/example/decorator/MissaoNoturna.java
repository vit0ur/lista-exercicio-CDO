package org.example.decorator;

public class MissaoNoturna extends MissaoDecorator{
    public MissaoNoturna(Missao missao) {
        super(missao);
    }

    @Override
    public double getRecompensa() {
        return missao.getRecompensa() * 1.1;
    }

    @Override
    public String getDescricao() {
        return missao.getDescricao() + " [Noturna]";
    }
}
