package org.example.decorator;

public class MissaoBase implements Missao {
    private String descricao;
    private double recompensa;

    public MissaoBase(String descricao, double recompensa) {
        this.descricao = descricao;
        this.recompensa = recompensa;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getRecompensa() {
        return recompensa;
    }
}
