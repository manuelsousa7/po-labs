// In Menu sub-clasess we only need to implement the CONSTRUCTOR
// This is done as shown: 
// 1. The constructor typically receives and Object of the CORE
// 2. The constructor calls to the constructor of the superclass Menu with two parameters: the title of the MENU and a list of commands that receive the core entity
// 3. In this exemple, the menu has two options represented by two instances od OptionA and OptionB.

import pt.utl.ist.po.ui.*; // po-uilib classes

public class MainMenu extends Menu {

    //Constructor
    public MainMenu(CoreEntity ent) {
        super("MENU PRINCIPAL", new Command<?>[] {
                    new AddNumber(ent), new ListNumbers(ent),
                    }); 
    }
}
