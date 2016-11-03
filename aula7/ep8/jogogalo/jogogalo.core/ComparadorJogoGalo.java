class ComparadorJogoGalo implements Comparator<JogoGalo>() {

    public int compare(JogoGalo g1, JogoGalo g2) {
        
        if (g1.obtemResultado() == g2.obtemResultado())
            return 0;
        
        switch (g1.obtemResultado()) {
            case JOGADOR_1:
                return 1;
            case EMPATE:
                return -1;
            case JOGADOR_2:
                if (g2.obtemResultado() == ResultadoJogo.JOGADOR_1)
                    return -1;
                return 1;
            default:
                return -1;
                        
        }
    }
}