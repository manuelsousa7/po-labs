package jogogalo.textui.main;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;

import jogogalo.textui.view.ShowGame;
import jogogalo.textui.view.ShowNumberOfGames;
import jogogalo.textui.view.ShowVictoriousPlayer;

import jogogalo.core.AplicacaoJogoGalo;

/**
 * Command for showing data of old games. creates a menu with two options for showing information
 * about fineshed games.
 */
public class ViewData extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     * 
     * @param app the target entity.
     */
    public ViewData(AplicacaoJogoGalo app) {
        super("Mostar Historico", app);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {

        Command<?>[] commands = {
            new ShowNumberOfGames(entity()),
            new ShowGame(entity()),
            new ShowVictoriousPlayer(entity()),
        };

        Menu historicoMenu = new Menu("Historico", commands);
        historicoMenu.open();
    }
}