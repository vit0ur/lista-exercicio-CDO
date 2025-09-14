package org.example;

import org.example.composite.ComposicaoUnidade;
import org.example.composite.Soldado;
import org.example.decorator.*;
import org.example.observer.Campeonato;
import org.example.observer.Time;
import org.example.observer.TimeConcreto;
import org.example.strategy.Carrinho;
import org.example.strategy.DescontoFixo;
import org.example.strategy.DescontoPercentual;
import org.example.strategy.DescontoProgressivo;

public class Main {
    public static void main(String[] args) {

        Campeonato campeonato = new Campeonato();

        Time t1 = new TimeConcreto("Leões");
        Time t2 = new TimeConcreto("Tigres");

        campeonato.inscrever(t1);
        campeonato.inscrever(t2);

        campeonato.marcarPartida("Leões vs Tigres");
        campeonato.publicarResultado("Leões 2 x 1 Tigres");

        campeonato.desinscrever(t2);
        campeonato.marcarPartida("Leões vs Lobos");

       /*Strategy
            Carrinho carrinho = new Carrinho();

            double total = 500;
            int itens = 5;

            carrinho.setEstrategia(new DescontoFixo());
            System.out.println("Desconto fixo: " + carrinho.calcularTotal(total, itens));

            carrinho.setEstrategia(new DescontoPercentual());
            System.out.println("Desconto percentual: " + carrinho.calcularTotal(total, itens));

            carrinho.setEstrategia(new DescontoProgressivo());
            System.out.println("Desconto progressivo: " + carrinho.calcularTotal(total, itens));
        */

        /*Decorator
            Missao missao = new MissaoBase("Derrotar o dragão", 100);

            missao = new MissaoNoturna(missao);
            missao = new MissaoHardcore(missao);
            missao = new MissaoTempo(missao);

            System.out.println("Missão: " + missao.getDescricao());
            System.out.println("Recompensa: " + missao.getRecompensa());
         */

        /*Composite
            Soldado s1 = new Soldado(10);
            Soldado s2 = new Soldado(15);
            Soldado s3 = new Soldado(20);

            ComposicaoUnidade esquadrao = new ComposicaoUnidade();
            esquadrao.adicionar(s1);
            esquadrao.adicionar(s2);

            ComposicaoUnidade batalhao = new ComposicaoUnidade();
            batalhao.adicionar(esquadrao);
            batalhao.adicionar(s3);

            System.out.println("Poder esquadrão: " + esquadrao.getPoderDeAtaque());
            System.out.println("Poder batalhão: " + batalhao.getPoderDeAtaque());
        */
    }
}