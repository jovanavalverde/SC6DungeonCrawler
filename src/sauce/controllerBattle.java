import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;

public class controllerBattle {

    public TextArea battleText;
    private controllerGame gameControl;
    private appDungGame app;
    @FXML
    private Rectangle healthBar;
    @FXML
    private Rectangle enemyHealthBar;
    @FXML
    private Rectangle manaBar;
    @FXML
    public Rectangle playerPos;
    @FXML
    private Rectangle enemyPos;
    @FXML
    private Button buttonAttack;
    @FXML
    private Text playHPText;
    @FXML
    private Text playMPText;
    @FXML
    private Text enHPText;

    public ImagePattern sprite;

    @FXML
    void playerAttack(ActionEvent event){
        battle.playerAttack();
        updateBars();
    }

    public void setApp(appDungGame app,controllerGame gameControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.gameControl = gameControl;
    }

    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        updateBars();
        updateText();

        playerPos.setFill(sprite);
        enemyPos.setFill(new ImagePattern(battle.opponent.entSprite));
    }


    public void updateBars(){
        healthBar.setWidth(400.0*Main.character.playHP/Main.character.playMaxHP);//400 being the pixel length of the bar.

        manaBar.setWidth(400.0*Main.character.playMP/Main.character.playMaxMP);//400 being the pixel length of the bar.

        enemyHealthBar.setWidth(400.0*battle.opponent.HP/battle.opponent.maxHP);//400 being the pixel length of the bar.

    }

    public void updateText(){

        playHPText.setText("HP: " + Main.character.playHP + "/" + Main.character.playMaxHP);
        playMPText.setText("MP: " + Main.character.playMP + "/" + Main.character.playMaxMP);

        enHPText.setText("HP: " + battle.opponent.HP + "/" + battle.opponent.maxHP);


    }



    public void endBattle(){
        gameControl.updateBars();

        app.setScreen(app.getScene(0));
    }


    public void useManaPotion(ActionEvent actionEvent) {
        Main.character.useManaPotion();
        System.out.println("You used a 100 Mana Potion");
        updateBars();
        updateText();
    }
    public void useHealthPotion(ActionEvent actionEvent) {
        Main.character.useHealthPotion();
        System.out.println("You used a 100 Health Potion");
        updateBars();
        updateText();
    }
}
