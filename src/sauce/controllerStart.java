import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerStart {
@FXML
private Rectangle startBackground;
@FXML
private appDungGame app;

    public void initialize(){
        startBackground.setFill(new ImagePattern(new Image("Dungeon Title.jpg")));
    }

    public void startGame( ){
        app.setScreen(app.getScene(0));
    }
    public void setApp(appDungGame app){
        this.app = app;
    }
}
