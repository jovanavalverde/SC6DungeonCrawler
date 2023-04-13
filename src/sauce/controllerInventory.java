import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;

public class controllerInventory {

    /*This is the controller class for inventoryScreen.fxml.*/

    private appDungGame app;

    private controllerGame gameControl;

    private Button[] invButtons = new Button[15];

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
     Button manaSlot;
    @FXML
     Button healthSlot;
    public Text manaText;
    public Text healthText;
    @FXML
    private Button slotEqAr;
    @FXML
    private Button slotEqWe; //All inventory Buttons
    @FXML
    private Rectangle healthBar;
    @FXML
    private Rectangle manaBar;



    public void setApp(appDungGame app,controllerGame gameControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets game control to the dungeonGame.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.gameControl = gameControl;
    }

    public void initialize(){
/*Code within the Initialize method will run once the fxml is loaded.*/



        {invButtons[1] = slot1;
        invButtons[2] = slot2;
        invButtons[3] = slot3;
        invButtons[4] = slot4;
        invButtons[5] = slot5;
        invButtons[6] = slot6;
        invButtons[7] = slot7;
        invButtons[8] = slot8;
        invButtons[9] = slot9;
        invButtons[10] = slot10;
        invButtons[11] = manaSlot;
        invButtons[12] = healthSlot;
        invButtons[13] = slotEqWe;
        invButtons[14] = slotEqAr;}//Setting Buttons to invButtons[], 13 = eqWeapon, 14 = eqArmor.
        updateInv();

    }

    public void closeInventory(ActionEvent actionEvent) {
        /*This method is assigned to a button in the inventory screen to swap the window back to the game screen.*/
        gameControl.updateBars();
        app.setScreen(app.getScene(0));
    }

    public void updateInv(){
        /*This updates the sprites loaded in as inventory slots.*/
        for (int n = 1; n <= 12; n++) {// 'n' must remain below 13
            if (Main.character.playerInventory[n] != null) {
                ImageView img = new ImageView(Main.character.playerInventory[n].itemSprite);
                img.setPreserveRatio(true);
                img.fitWidthProperty().bind(slot1.widthProperty());
                img.fitHeightProperty().bind(slot1.heightProperty());
                invButtons[n].setGraphic(img);
            }
        }

        {ImageView img = new ImageView(Main.character.eqItemWeapon.itemSprite);
        img.setPreserveRatio(true);
        img.fitWidthProperty().bind(slot1.widthProperty());
        img.fitHeightProperty().bind(slot1.heightProperty());
        slotEqWe.setGraphic(img);

        ImageView img2 = new ImageView(Main.character.eqItemArmor.itemSprite);
        img2.setPreserveRatio(true);
        img2.fitWidthProperty().bind(slot1.widthProperty());
        img2.fitHeightProperty().bind(slot1.heightProperty());
        slotEqAr.setGraphic(img2);}//Updates the equipped gear buttons

        healthText.setText(String.valueOf(Main.character.playerPotions[0]));
        manaText.setText(String.valueOf(Main.character.playerPotions[1]));

        healthBar.setWidth(400.0*Main.character.playHP/Main.character.playMaxHP);//400 being the pixel length of the bar.

        manaBar.setWidth(400.0*Main.character.playMP/Main.character.playMaxMP);//400 being the pixel length of the bar.
    }


    public void useItem(ActionEvent actionEvent) {
        /*This method will equip the weapon/armor piece when clicked.*/
        for (int n = 0; n <= 12; n++) {

            if (actionEvent.getSource() == invButtons[n]) {
                if (Main.character.playerInventory[n] instanceof itemWeapon){
                    itemWeapon hold = Main.character.eqItemWeapon;
                    Main.character.eqItemWeapon = (itemWeapon) Main.character.playerInventory[n];
                    Main.character.playerInventory[n] = hold;
                } else if (Main.character.playerInventory[n] instanceof itemArmor) {
                    itemArmor hold = Main.character.eqItemArmor;
                    Main.character.eqItemArmor = (itemArmor) Main.character.playerInventory[n];
                    Main.character.playerInventory[n] = hold;
                }
            }
        }
        updateInv();
    }


    public void drinkPotion(ActionEvent actionEvent) {
        if (actionEvent.getSource() == healthSlot){
            if (Main.character.playerPotions[0] > 0){
                Main.character.useHealthPotion();
                updateInv();
            }else {
                System.out.println("No health potions left.");
            }
        } else if (actionEvent.getSource() == manaSlot) {
            System.out.println("You cant use mana potions outside of battle.");
        }
    }
}
