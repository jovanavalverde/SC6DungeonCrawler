import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerGame {
    /*This is the controller class for dungeonGame.fxml.*/


    @FXML
    private Rectangle fred;//Fred is the rectangle that will be the player.
    @FXML
    private Rectangle gameScreen;
    @FXML
    private Rectangle healthBar;
    @FXML
    private Rectangle manaBar;
    private appDungGame app;
    private controllerInventory invControl;
    private controllerBattle battleControl;

    private Image dungImg = new Image("Dungoen Background.png");//Don't judge me I'm dyslexic.


    public void setApp(appDungGame app,controllerInventory invControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.invControl = invControl;
        this.battleControl = battleControl;
    }

    public void setFred(){
        if (Main.character.playClass == "mage"){
            fred.setFill(new ImagePattern(new Image("realSprites/mage.png")));
        } else if (Main.character.playClass == "rogue") {
            fred.setFill(new ImagePattern(new Image("realSprites/rogue.png")));
        } else if (Main.character.playClass == "warrior") {
            fred.setFill(new ImagePattern(new Image("realSprites/warrior.png")));
        }else {
            System.out.println("Error, playClass not set properly.");
        }
    }

    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        gameScreen.setFill(new ImagePattern(dungImg));
        updateBars();
    }

//--------------------Move Button Methods--------------------
    public void moveUp(ActionEvent actionEvent) {
        fred.setTranslateY(fred.getTranslateY()-123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveDown(ActionEvent actionEvent) {
        fred.setTranslateY(fred.getTranslateY()+123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveLeft(ActionEvent actionEvent) {
        fred.setTranslateX(fred.getTranslateX()-123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveRight(ActionEvent actionEvent) {
        fred.setTranslateX(fred.getTranslateX()+123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }


    public void openInventory(ActionEvent actionEvent) {
        /*This method is assigned to a button in the game screen to swap the window to the inventory screen.*/

        app.setScreen(app.getScene(1));
        invControl.updateInv();
        updateBars();
    }

    public void updateBars(){
        healthBar.setWidth(400*(Main.character.playHP/100.0));//100 being the current max health,
        //and 400 being the pixel length of the bar.

        manaBar.setWidth(400*(Main.character.playMP/100.0));//100 being the current max mana,
        //and 400 being the pixel length of the bar.
    }
}
