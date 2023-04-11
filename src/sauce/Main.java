import javafx.application.Application;
public class Main {


//This is the only player character object that will be used.
    static player character = new player();
    private static appDungGame app;
    private static controllerInventory invControl;
    private static controllerBattle battleControl;
    private static controllerGame gameControl;

    public static void setApp(appDungGame appP, controllerInventory invControlP, controllerBattle battleControlP, controllerGame gameControlP){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/
        app = appP;
        invControl = invControlP;
        battleControl = battleControlP;
        gameControl = gameControlP;
    }


    public static int ranCal(int min, int max){
        /*This method is just to easily find a random int between a min and max.*/
        int ranDam = (int)((Math.random() * ((max+1) - min)) + min);
        return ranDam;
    }







    public static void main(String[] args) {


//This launches the actual application in appDungGame
        Application.launch(appDungGame.class);













    }
}