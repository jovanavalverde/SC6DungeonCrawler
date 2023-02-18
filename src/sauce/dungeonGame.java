import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.Objects;


public class dungeonGame extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dungeonGame.fxml")));
        window.setTitle("Super Duper Dungeon");
        window.setScene(new Scene(root));
        window.show();
    }
}
