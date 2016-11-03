// In Command sub-classes we basically interact with  entities of the core (call methods)
// In Command sub-classes we need to implement:
//
// 1. The constructor, that typically receives one or more objects of the core. 
//    We have to call the constructor of the super-class (usually with a title and the entity of the core) 
// 2. The method execute(), that calls the methods of the core entities
//
// User interaction (input and output data) is done using the classes Form and Display as shown

import pt.utl.ist.po.ui.*; // po-uilib classes

public class AddNumber extends Command<CoreEntity> {
        
    //Constructor
    public AddNumber(CoreEntity ent) {
        super("Add Number", ent);
    }

    public void execute() {  // executed when this option is selected
        Form f = new Form(title());
        InputInteger num = new InputInteger(f, "Introduce a number: ");
        f.parse();

        entity().addNumber(num.value());
    }
}
