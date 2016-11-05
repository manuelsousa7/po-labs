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
public class ShowGame extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     *
     * @param ent the target entity.
     */
    public ShowGame(AplicacaoJogoGalo app) {
        super("Mostrar Estado De Jogo", app);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        Form f = new Form();
        InputInteger inI = new InputInteger(f, "Indique o indice do jogo que pretende aceder : ");
        f.parse();

        if (entity().obtemJogo(inI.value()) != null) {
            System.out.println("Estado do jogo indicado : " + entity().obtemJogo(inI.value()).obtemEstadoJogo());
        }
        else {
            System.out.println("Indice invalido!");
        }
    }
}