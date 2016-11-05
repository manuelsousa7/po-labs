package jogogalo.textui.view;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;

import jogogalo.core.AplicacaoJogoGalo;

/**
 * Command for showing the number of finished games.
 */
public class ShowNumberOfGames extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     *
     * @param ent the target entity.
     */
    public ShowNumberOfGames(AplicacaoJogoGalo app) {
        super("Obter Número de Jogos", app);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        System.out.println("Numero de jogos terminados : " + entity().obtemNumeroJogos());
    }
}