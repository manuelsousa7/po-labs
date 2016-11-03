import pt.utl.ist.po.ui.*; // po-uilib classes

class Submenu extends Command<CoreEntity> { // Create submenu with new entity
    public Submenu(CoreEntity ent) {
        super("Submenu option", ent);
    }

    public void execute() { // executed when this option is selected
	(new MainMenu(entity())).open();
    }
}
