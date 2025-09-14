package org.example.strategy;

public class DescontoFixo implements EstrategiaDesconto {
    @Override
    public double calcular(double total, int qtdItens) {
        return total - 50;
    }
}
