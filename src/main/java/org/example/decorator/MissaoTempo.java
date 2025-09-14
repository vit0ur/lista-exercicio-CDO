package org.example.decorator;

public class MissaoTempo extends MissaoDecorator {
    public MissaoTempo(Missao missao) {
        super(missao);
    }

    @Override
    public double getRecompensa() {
        return missao.getRecompensa() * 1.2;
    }

    @Override
    public String getDescricao() {
        return missao.getDescricao() + " [Com tempo]";
    }
}
