package jogogalo.textui.view;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;

import jogogalo.core.AplicacaoJogoGalo;
import jogogalo.core.JogoGalo;

/**
 * Command for showing the final state of a finished game.
 */
public class ShowGame extends Command</* FIXME: core class */> {

    /**
     * Constructor.
     * 
     * @param ent the target entity.
     */
    public ShowGame(/* FIXME: decls of argument(s) for receiver(s) */) {
        super("Mostrar Jogo", ent);
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