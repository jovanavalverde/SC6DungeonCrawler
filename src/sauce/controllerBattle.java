
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.Image;
import javafx.scene.text.Text;



public class controllerBattle {

    public TextArea battleText;
    public Button buttonAttack;
    private displayMessage displayMessage = new displayMessage();
    private controllerGame gameControl;
    private appDungGame app;
    @FXML
    private Rectangle healthBar;
    @FXML
    private Rectangle enemyHealthBar;
    @FXML
     Rectangle manaBar;
    @FXML
    public Rectangle playerPos;
    @FXML
    Rectangle enemyPos;
    @FXML
    private Text playHPText;
    @FXML
    private Text playMPText;
    @FXML
    private Text enHPText;

    public ImagePattern sprite;
    @FXML
    private Rectangle magicAni;
    @FXML
    private Rectangle swordAni;
    @FXML
    private Rectangle daggerAni;
    @FXML
    private Rectangle daggerAni1;


    @FXML
    void playerAttack(ActionEvent event){

        if(battle.doTurn == true) {

            battle.playerAttack();
        }
    }

    @FXML
    void playerSpecialAttack(ActionEvent event){

        if(battle.doTurn == true) {
            if(Main.character.playClass == "mage") {

                animation.magicAttackAnimation(magicAni);

            }else if(Main.character.playClass == "rogue"){

                animation.daggerAttackAnimation(daggerAni, daggerAni1);

            }else if(Main.character.playClass == "warrior"){

                animation.swordAttackAnimation(swordAni);

            }else {
                System.out.println("E:" + 400);
            }

            battle.playerSpecialAttack();

        }
    }

    public void setApp(appDungGame app,controllerGame gameControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.gameControl = gameControl;
    }

    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        updatePlayerBars();
        updateEnemyBars();
        updateText();
        magicAni.setOpacity(0);
        swordAni.setOpacity(0);
        daggerAni.setOpacity(0);
        daggerAni.setOpacity(0);
        daggerAni1.setOpacity(0);
        magicAni.setFill(new ImagePattern(new Image("realSprites/magic.png")));
        swordAni.setFill(new ImagePattern(new Image("realSprites/sword.png")));
        daggerAni.setFill(new ImagePattern(new Image("realSprites/slash.png")));
        daggerAni1.setFill(new ImagePattern(new Image("realSprites/slash.png")));

        playerPos.setFill(sprite);
        enemyPos.setFill(new ImagePattern(battle.opponent.entSprite));
    }

    public void updatePlayerBars(){
        healthBar.setWidth(400.0*Main.character.playHP/Main.character.playMaxHP);//400 being the pixel length of the bar.

        manaBar.setWidth(400.0*Main.character.playMP/Main.character.playMaxMP);//400 being the pixel length of the bar.


    }

    public void updateEnemyBars(){
        enemyHealthBar.setWidth(400.0*battle.opponent.HP/battle.opponent.maxHP);//400 being the pixel length of the bar.
    }


    public void updateText(){

        playHPText.setText("HP: " + Main.character.playHP + "/" + Main.character.playMaxHP);
        playMPText.setText("MP: " + Main.character.playMP + "/" + Main.character.playMaxMP);

        enHPText.setText("HP: " + battle.opponent.HP + "/" + battle.opponent.maxHP);

    }

    public void updateBattleText(int index, Object... args){

        String message = String.format(displayMessage.battleMessage[index], args);
        battleText.appendText(message + "\n");

    }

    public void buildBattle(){
        battle.opponent = (entEnemy) gameControl.currentRoom.opponent;
        battleText.setText("");
        updatePlayerBars();
        updateEnemyBars();
        updateText();
        updateBattleText(0);
        app.setScreen(app.getScene(2));
        enemyPos.setFill(new ImagePattern(battle.opponent.entSprite));

    }



    public void endBattle(){
        gameControl.updateBars();
        app.setScreen(app.getScene(0));
    }


    public void useManaPotion(ActionEvent actionEvent) {
        if(battle.doTurn == true) { //doTurn check is to stop being able to spam buttons over and over
            battle.doTurn = false;
            if (Main.character.playerPotions[1] <= 0) {
                updateBattleText(6);
                battle.doTurn = true;
            } else {
                battle.turnCount += 1;
                Main.character.useManaPotion();
                System.out.println("You used a 100 Mana Potion");
                updatePlayerBars();
                updateText();
                updateBattleText(7, battle.turnCount);
                updateBattleText(4, 100);
                battle.enemyAttack();
            }
        }
    }
    public void useHealthPotion(ActionEvent actionEvent) {
        System.out.println(Main.character.playerPotions[0]);
        if (battle.doTurn == true) { //doTurn check is to stop being able to spam buttons over and over
            battle.doTurn = false;
            if (Main.character.playerPotions[0] <= 0) {
                updateBattleText(5);
                battle.doTurn = true;
            } else {
                battle.turnCount += 1;
                Main.character.useHealthPotion();
                System.out.println("You used a 100 Health Potion");
                updatePlayerBars();
                updateText();
                updateBattleText(7, battle.turnCount);
                updateBattleText(3, 100);
                battle.enemyAttack();
            }
        }
    }

}
