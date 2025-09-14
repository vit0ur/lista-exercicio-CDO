package org.example.strategy;

public class DescontoPercentual implements EstrategiaDesconto {
    @Override
    public double calcular(double total, int qtdItens) {
        return total * 0.5;
    }
}