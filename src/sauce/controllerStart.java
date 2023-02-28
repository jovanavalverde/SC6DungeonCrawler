import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerStart {
/*This is the controller class for startScreen.fxml.*/


//--------------------Variables that match objects in the fxml--------------------
@FXML
private appDungGame app;
@FXML
private Rectangle startBackground;



//--------------------X--------------------
    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        startBackground.setFill(new ImagePattern(new Image("Dungeon Title.jpg")));
    }


public void setApp(appDungGame app){
    /*This method sets the app variable to appDungGame application so the window can be changed.*/
    this.app = app;
}

    public void startGame(){
        /*This method is assigned to a button that will close the start screen and start the game.*/
        app.setScreen(app.getScene(0));
    }
}
