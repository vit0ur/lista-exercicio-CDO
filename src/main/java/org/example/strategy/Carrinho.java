package org.example.strategy;

public class Carrinho {
    private EstrategiaDesconto estrategia;

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal(double total, int qtdItens) {
        return estrategia.calcular(total, qtdItens);
    }
}
