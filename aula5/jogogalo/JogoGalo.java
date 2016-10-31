package jogogalo;
import java.util.*;
public class JogoGalo {
	LinkedList _jogos = new LinkedList();
	public void add(JogoGalo jogo) {
        _jogos.add(jogo);
    }

    public String get(int idx) {
        
        return (JogoGalo) _jogos.get(idx);
    }
    /**
     * Funcao main com execucao das jogadas
     *
     * @param args argumentos String[]
     */
    public static void main(String[] args) {
        Jogo jogo = new Jogo(3);
        Peca p1 = new PecaJogador1();
        Peca p2 = new PecaJogador2();

        System.out.println("Estado Inicial\n" + jogo.obtemEstadoJogo());
        jogo.joga(p1, 1, 1);
        jogo.joga(p2, 1, 2);
        System.out.println("Após duas jogadas\n" + jogo.obtemEstadoJogo());
        
        System.out.println("P1 ganhou " + jogo.ganhou(1, 1));
        System.out.println("P2 ganhou " + jogo.ganhou(1, 2));

        jogo.joga(p1, 2, 2);
        jogo.joga(p2, 2, 3);
        System.out.println("Após 4  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou " + jogo.ganhou(2, 2));
        System.out.println("P2 ganhou " + jogo.ganhou(2, 3));

        jogo.joga(p1, 3, 1);
        jogo.joga(p2, 2, 1);
        System.out.println("Após 6  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou " + jogo.ganhou(3, 1));
        System.out.println("P2 ganhou " + jogo.ganhou(2, 1));

        jogo.joga(p1, 3, 3);
        System.out.println("Após 7  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou: " + jogo.ganhou(3, 3));
    }

}

