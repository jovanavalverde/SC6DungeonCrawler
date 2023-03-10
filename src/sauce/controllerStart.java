import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerStart {
    @FXML
    public Button warriorButton;
    @FXML
    public Button mageButton;
    @FXML
    public Button rogueButton;
    @FXML
    public Button startButton;
    @FXML
    public Rectangle warrior;
    @FXML
    public Rectangle mage;
    @FXML
    public Rectangle rogue;
    /*This is the controller class for startScreen.fxml.*/


@FXML
private appDungGame app;

controllerGame gameControl;
@FXML
private Rectangle startBackground;



//--------------------X--------------------
    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        startBackground.setFill(new ImagePattern(new Image("Dungeon Title.jpg")));
        startButton.setTranslateY(-200);
        rogue.setFill(new ImagePattern(new Image("realSprites/rogue.png")));
        mage.setFill(new ImagePattern(new Image("realSprites/mage.png")));
        warrior.setFill(new ImagePattern(new Image("realSprites/warrior.png")));
    }


public void setApp(appDungGame app, controllerGame gameControl){
    /*This method sets the app variable to appDungGame application so the window can be changed.*/
    this.app = app;
    this.gameControl = gameControl;
}

    public void startGame(){
        /*This method is assigned to a button that will close the start screen and start the game.*/
        app.setScreen(app.getScene(0));
        dungeon.createWeapons(Main.character);
        dungeon.createArmor(Main.character);
        gameControl.setFred();
    }

    public void selectClass(ActionEvent actionEvent) {
        if(actionEvent.getSource() == mageButton){
            Main.character.playClass = "mage";
        } else if (actionEvent.getSource() == rogueButton) {
            Main.character.playClass = "rogue";
        } else if (actionEvent.getSource() == warriorButton) {
            Main.character.playClass = "warrior";
        }else {
            System.out.println("Method  'selectClass' incorrectly called.");
        }
        startButton.setTranslateY(0);
    }
}
