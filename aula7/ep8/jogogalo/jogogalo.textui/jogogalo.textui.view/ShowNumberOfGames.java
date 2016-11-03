package jogogalo.textui.view;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;

import jogogalo.core.AplicacaoJogoGalo;

/**
 * Command for showing the number of finished games.
 */
public class ShowNumberOfGames extends Command</* FIXME: core class */> {

    /**
     * Constructor.
     * 
     * @param ent the target entity.
     */
    public ShowNumberOfGames(/* FIXME: decls of argument(s) for receiver(s) */) {
        super("Obter Número de Jogos", ent);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        // add code here
    }
}