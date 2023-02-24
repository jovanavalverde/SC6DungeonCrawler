import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class appDungGame extends Application {


private Stage window;
private Scene[] sceneArray = new Scene[2];
public void setScreen(Scene s){
    this.window.setScene(s);
}
public Scene getScene(int n){
    return sceneArray[n];
}

    @Override
    public void start(Stage window) throws Exception {
        this.window = window;
        FXMLLoader startLoader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("startScreen.fxml")));
        FXMLLoader gameLoader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("dungeonGame.fxml")));
        sceneArray[0] =  new Scene(gameLoader.load());

        Parent start = startLoader.load();


        window.setTitle("Super Duper Dungeon");
        Scene game = new Scene(start);
        window.setScene(game);


        controllerStart startControl = startLoader.getController();
        controllerGame gameControl = gameLoader.getController();
        gameControl.setApp(this);
        startControl.setApp(this);


        window.show();

    }


}
