package org.example.strategy;

public class DescontoProgressivo implements EstrategiaDesconto {
    @Override
    public double calcular(double total, int qtdItens) {
        double desconto = 0.05 * qtdItens; // 5% por item
        desconto = Math.min(desconto, 0.5); // máximo 50%
        return total * (1 - desconto);
    }
}
