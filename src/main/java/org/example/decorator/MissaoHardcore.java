package org.example.decorator;

public class MissaoHardcore extends MissaoDecorator {
    public MissaoHardcore(Missao missao) {
        super(missao);
    }

    @Override
    public double getRecompensa() {
        return missao.getRecompensa() * 1.5;
    }

    @Override
    public String getDescricao() {
        return missao.getDescricao() + " [Hardcore]";
    }
}
