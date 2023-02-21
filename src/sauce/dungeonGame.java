import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.Objects;


public class dungeonGame extends Application {

static String currentScreen = "startScreen";//Can only equal "startScreen", "gameScreen", "battleScreen", "invScreen".
static String newScreen = currentScreen;

    @Override
    public void start(Stage window) throws Exception {

        /* -----Skipping Start Screen for Testing Purposes. -----Restore before publish-----
        Parent start = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("startScreen.fxml")));
        window.setTitle("Super Duper Dungeon");
        Scene startScreen = new Scene(start);
        window.setScene(startScreen);
        window.show();
*/
        Parent start = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dungeonGame.fxml")));
        window.setTitle("Super Duper Dungeon");
        Scene game = new Scene(start);
        window.setScene(game);
        window.show();



    }


}
