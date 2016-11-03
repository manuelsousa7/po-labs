// The class that contains the main should:
// 1. Create the main entity of the core application that gives context to the MainMenu
// 2. Create the main menu and open it 

public class Main {

    public static void main (String[] args) {
        CoreEntity myObject = new CoreEntity();  // Create main Entity
        MainMenu mainMenu = new MainMenu(myObject); // Create menu with Entity
        mainMenu.open(); // Open the menu
    }
}
