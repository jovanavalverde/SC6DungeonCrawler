import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
public class controllerBattle {
    private controllerGame gameControl;
    private appDungGame app;
    @FXML
    private Rectangle healthBar;
    @FXML
    private Rectangle enemyHealthBar;
    @FXML
    private Rectangle manaBar;
    @FXML
    private Circle playerPos;
    @FXML
    private Circle enemyPos;
    @FXML
    private Button buttonAttack;
    private Image sprite = new Image("realSprites/mage.png");

    @FXML
    void playerAttack(ActionEvent event){
        battle.playerAttack();
    }



    public void updateBars(){
        healthBar.setWidth(400*(Main.character.playHP/100.0));//100 being the current max health,
        //and 400 being the pixel length of the bar.

        manaBar.setWidth(400*(Main.character.playMP/100.0));//100 being the current max mana,
        //and 400 being the pixel length of the bar.

        //enemyHealthBar.setWidth(400*(Main.character.enemyHP/100.0));//100 being the current max mana,
        //and 400 being the pixel length of the bar.

    }


}
