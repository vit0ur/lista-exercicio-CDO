package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private List<Time> times = new ArrayList<>();

    public void inscrever(Time time) {
        times.add(time);
    }

    public void desinscrever(Time time) {
        times.remove(time);
    }

    public void notificar(String mensagem) {
        for (Time time : times) {
            time.atualizar(mensagem);
        }
    }


    public void marcarPartida(String partida) {
        notificar("Nova partida marcada: " + partida);
    }

    public void publicarResultado(String resultado) {
        notificar("Resultado publicado: " + resultado);
    }
}