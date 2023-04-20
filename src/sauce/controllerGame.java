import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;
import java.text.DecimalFormat;

public class controllerGame {

    /*This is the controller class for dungeonGame.fxml.*/
    public Text winText;
    @FXML
    private Rectangle fred;//Fred is the rectangle that will be the player.
    @FXML
    private Rectangle gameScreen;
    @FXML
     Rectangle healthBar;
    @FXML
     Rectangle manaBar;



    private appDungGame app;
    private controllerInventory invControl;
    private controllerBattle battleControl;
    public room currentRoom;

    private final Image dungImg = new Image("Dungoen Background.png");//Don't judge me I'm dyslexic.


    public void setApp(appDungGame app,controllerInventory invControl, controllerBattle battleControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/
        this.app = app;
        this.invControl = invControl;
        this.battleControl = battleControl;
    }


    public void initialize(){
        /*Code within the Initialize method will run once the fxml is loaded.*/
        updateBars();
        currentRoom = dungeon.allRooms[0];
        winText.setTranslateY(500);
    }

//--------------------Move Button Methods--------------------
    public void moveUp(ActionEvent actionEvent) {
        if (currentRoom.opponent == null || currentRoom.opponent.lootCollected) {
            if (attemptMove(1, "y")) {
                //fred.setLayoutX(currentRoom.coordinates[0]);
                //fred.setLayoutY(currentRoom.coordinates[1]);
                double newY = currentRoom.coordinates[1] - fred.getLayoutY();

                animation.yMovementAnimation(newY, fred);
            }
        }else {
            System.out.println("Opponent not defeated.");
        }
    }
    public void moveDown(ActionEvent actionEvent) {
        if (currentRoom.opponent == null || currentRoom.opponent.lootCollected) {
            if (attemptMove(-1, "y")) {
                //fred.setLayoutX(currentRoom.coordinates[0]);
                //fred.setLayoutY(currentRoom.coordinates[1]);

                double newY = currentRoom.coordinates[1] - fred.getLayoutY();

                animation.yMovementAnimation(newY, fred);
            }
        }else {
            System.out.println("Opponent not defeated.");
        }
    }
    public void moveLeft(ActionEvent actionEvent) {
        if (currentRoom.opponent == null || currentRoom.opponent.lootCollected) {
            if (attemptMove(-1, "x")) {
                //fred.setLayoutX(currentRoom.coordinates[0]);
                //fred.setLayoutY(currentRoom.coordinates[1]);
                double newX = currentRoom.coordinates[0] - fred.getLayoutX();

                animation.xMovementAnimation(newX, fred);
            }
        }else {
            System.out.println("Opponent not defeated.");
        }
    }
    public void moveRight(ActionEvent actionEvent) {
        if (currentRoom.opponent == null || currentRoom.opponent.lootCollected) {
            if (attemptMove(1, "x")) {
                //fred.setLayoutX(currentRoom.coordinates[0]);
                //fred.setLayoutY(currentRoom.coordinates[1]);
                double newX = currentRoom.coordinates[0] - fred.getLayoutX();

                animation.xMovementAnimation(newX, fred);
            }
        }else {
            System.out.println("Opponent not defeated.");
        }
    }
    private boolean attemptMove(int n, String t){
        int newCord;
        boolean subRoom = false;
        boolean targetSubRoom = false;
        if (currentRoom.roomNum%1 != 0){
            subRoom = true;
        }
        if(t == "x"){
            newCord = currentRoom.location[0]+n;
            for(int i = 0; i< dungeon.allRooms.length; i++){

                if (dungeon.allRooms[i] != null) {

                    if (dungeon.allRooms[i].location[0] == newCord && dungeon.allRooms[i].location[1] == currentRoom.location[1]) {

                        double roomDiff = Math.round((currentRoom.roomNum-dungeon.allRooms[i].roomNum) * 10) / 10.0;

                        if (dungeon.allRooms[i].roomNum%1 != 0){
                            targetSubRoom = true;
                        }
                        if (subRoom || targetSubRoom){

                            if (roomDiff >= -0.1 && roomDiff <= 0.1){

                                currentRoom = dungeon.allRooms[i];
                                testWin();
                                return true;
                            }
                        }else {
                            currentRoom = dungeon.allRooms[i];
                            testWin();
                            return true;
                        }
                    }
                }
            }
        } else if (t == "y") {//--------------------------------------------------------------Y-------------------------------------
            newCord = currentRoom.location[1]+n;
            for(int i = 0; i< dungeon.allRooms.length; i++){

                if (dungeon.allRooms[i] != null) {

                    if (dungeon.allRooms[i].location[1] == newCord && dungeon.allRooms[i].location[0] == currentRoom.location[0]) {

                        double roomDiff = Math.round((currentRoom.roomNum-dungeon.allRooms[i].roomNum) * 10) / 10.0;

                        if (dungeon.allRooms[i].roomNum%1 != 0){
                            targetSubRoom = true;
                        }
                        if (subRoom || targetSubRoom){

                            if (roomDiff >= -0.1 && roomDiff <= 0.1){

                                currentRoom = dungeon.allRooms[i];
                                testWin();
                                return true;
                            }
                        }else {
                            currentRoom = dungeon.allRooms[i];
                            testWin();
                            return true;
                        }
                    }
                }
            }
        }
            System.out.println("That's a wall, probably...");
            return false;

    }
    private void testWin(){
        if (currentRoom == dungeon.secondFloor[7]){
            winText.setTranslateY(0);

        } else if (currentRoom == dungeon.firstFloor[12]) {
            setFloor2();

        }
    }
//--------------------Loaders--------------------
    public void setFred(){
        if (Main.character.playClass == "mage"){
            fred.setFill(new ImagePattern(new Image("realSprites/mage.png")));
            battleControl.sprite = (new ImagePattern(new Image("realSprites/mage.png")));
        } else if (Main.character.playClass == "rogue") {
            fred.setFill(new ImagePattern(new Image("realSprites/rogue.png")));
            battleControl.sprite = (new ImagePattern(new Image("realSprites/rogue.png")));
        } else if (Main.character.playClass == "warrior") {
            fred.setFill(new ImagePattern(new Image("realSprites/warrior.png")));
            battleControl.sprite = (new ImagePattern(new Image("realSprites/warrior.png")));
        }else {
            System.out.println("Error, playClass not set properly.");
        }
        fred.setLayoutX(currentRoom.coordinates[0]);
        fred.setLayoutY(currentRoom.coordinates[1]);
    }
    public void setFloor1(){
        gameScreen.setFill(new ImagePattern(dungImg));
        dungeon.allRooms = dungeon.firstFloor;
        if (currentRoom.roomNum != 0){
            currentRoom = dungeon.firstFloor[12];
        }else {
            currentRoom = dungeon.allRooms[0];
        }

    }
    public void setFloor2(){
        gameScreen.setFill(new ImagePattern(new Image("Dungoen Floor 2.png")));
        dungeon.allRooms = dungeon.secondFloor;
        currentRoom = dungeon.allRooms[0];// Must be set to 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public void openInventory(ActionEvent actionEvent) {
        /*This method is assigned to a button in the game screen to swap the window to the inventory screen.*/

        app.setScreen(app.getScene(1));
        invControl.updateInv();
        updateBars();
    }

    public void updateBars(){
        healthBar.setWidth(400.0*Main.character.playHP/Main.character.playMaxMP);//400 being the pixel length of the bar.

        manaBar.setWidth(400.0*Main.character.playMP/Main.character.playMaxMP);//400 being the pixel length of the bar.
    }

    public void testBattle(ActionEvent actionEvent) {
        if (currentRoom.opponent != null && !currentRoom.opponent.lootCollected) {
            battleControl.buildBattle();
        }else {
            System.out.println("There is no enemy in this room.");
        }
    }


}
