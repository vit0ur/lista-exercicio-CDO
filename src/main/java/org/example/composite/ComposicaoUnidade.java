package org.example.composite;
import java.util.ArrayList;

public class ComposicaoUnidade implements Unidade {
    private ArrayList<Unidade> unidades = new ArrayList<>();

    public void adicionar(Unidade unidade) {
        unidades.add(unidade);
    }

    public void remover(Unidade unidade) {
        unidades.remove(unidade);
    }

    @Override
    public int getPoderDeAtaque() {
        return unidades.stream().mapToInt(Unidade::getPoderDeAtaque).sum();
    }
}
