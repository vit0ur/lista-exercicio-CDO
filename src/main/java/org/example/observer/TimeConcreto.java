package org.example.observer;

public class TimeConcreto implements Time{
    private String nome;

    public TimeConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Time " + nome + " recebeu: " + mensagem);
    }
}
