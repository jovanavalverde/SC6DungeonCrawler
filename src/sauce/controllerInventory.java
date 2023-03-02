import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerInventory {
    /*This is the controller class for inventoryScreen.fxml.*/

    private appDungGame app;

    private controllerGame gameControl;

    private Button[] invButtons = new Button[13];

    @FXML
    private Button slot1;
    @FXML
    private Button slot2;
    @FXML
    private Button slot3;
    @FXML
    private Button slot4;
    @FXML
    private Button slot5;
    @FXML
    private Button slot6;
    @FXML
    private Button slot7;
    @FXML
    private Button slot8;
    @FXML
    private Button slot9;
    @FXML
    private Button slot10;
    @FXML
    private Button slot11;
    @FXML
    private Button slot12;//All inventory Buttons


    public void setApp(appDungGame app,controllerGame gameControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets game control to the dungeonGame.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.gameControl = gameControl;
    }

    public void initialize(){
/*Code within the Initialize method will run once the fxml is loaded.*/

        invButtons[1] = slot1;
        invButtons[2] = slot2;
        invButtons[3] = slot3;
        invButtons[4] = slot4;
        invButtons[5] = slot5;
        invButtons[6] = slot6;
        invButtons[7] = slot7;
        invButtons[8] = slot8;
        invButtons[9] = slot9;
        invButtons[10] = slot10;
        invButtons[11] = slot11;
        invButtons[12] = slot12;//Setting Buttons to invButtons[]
        updateInv();
    }

    public void closeInventory(ActionEvent actionEvent) {
        /*This method is assigned to a button in the inventory screen to swap the window back to the game screen.*/
        app.setScreen(app.getScene(0));
    }

    public void updateInv(){
        /*This updates the sprites loaded in as inventory slots.*/
        for (int n = 1; n <= 12; n++) {
            if (Main.character.playerInventory[n] != null) {
                ImageView img = new ImageView(Main.character.playerInventory[n].itemSprite);
                img.setPreserveRatio(true);
                img.fitWidthProperty().bind(slot1.widthProperty());
                img.fitHeightProperty().bind(slot1.heightProperty());
                invButtons[n].setGraphic(img);
            }
        }
    }


    public void useItem(ActionEvent actionEvent) {
        /*This method will equip the weapon/armor piece and drink the potion when clicked.*/
        for (int n = 0; n <= 12; n++) {
/*
            if (actionEvent.getSource() == invButtons[n]) {
                if (){

                }
            }*/
        }
    }
}
