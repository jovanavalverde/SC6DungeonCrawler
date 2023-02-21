import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.geometry.Insets;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.scene.paint.ImagePattern;

import java.io.IOException;

public class startController {
@FXML
private Rectangle startBackground;

    public void initialize(){
        startBackground.setFill(new ImagePattern(new Image("Dungeon Title.jpg")));
    }

    public void startGame(ActionEvent actionEvent) throws IOException {
        Parent game = FXMLLoader.load (getClass().getResource("dungeonGame.fxml"));
        Scene gameScreen = new Scene(game);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(gameScreen);
        window.show();
    }
}
