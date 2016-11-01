package jogogalo.core;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class AplicacaoJogoGalo {

    private List<JogoGalo> _jogos;

    public AplicacaoJogoGalo() {
        _jogos = new ArrayList<>();
    }

    public void guarda(JogoGalo jogo) {
        _jogos.add(jogo);
    }

    public JogoGalo obtemJogo(int idx) {
        if (idx <= 0 || idx > _jogos.size())
            return null;

        return _jogos.get(idx - 1);
    }

    public void escreveResultado() {
        Iterator<JogoGalo> iter = _jogos.iterator();
        int i = 0;

        while (iter.hasNext()) {
            JogoGalo jogo = iter.next();
            System.out.println("Resultado do jogo " + i++ + "\n" + jogo);
        }
    }

    public List<JogoGalo> obtemJogosOrdenados() {
        ComparadorJogoGalo comparador = new ComparadorJogoGalo();

        ArrayList<JogoGalo> ordenado = new ArrayList<>(_jogos);
        Collections.sort(ordenado, comparador);
        return ordenado;
    }
}