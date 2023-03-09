/*
Sprites: These are very low priority. If anyone comes across some "Slash" or "Magic strike"
image or sprite, try to save it as we may use it in animations.
 */
public class battle {
    static entEnemy opponent = dungeon.lvl0E;
    private static controllerBattle battleControl;

    public static void setApp(controllerBattle battleControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/

        battle.battleControl = battleControl;
    }

    public static void enemyAttack(){
        int[] damArray = opponent.calDamage();

        Main.character.changeHP(-damArray[0]);

        System.out.println("Health: " + Main.character.playHP);

        if (Main.character.playHP == 0) {
            endBattle();
        }
    }

    public static void playerAttack(){
        int[] damArray = Main.character.calDamage();

        for(int n = 0; n != damArray.length; n++ ){
            opponent.changeHP(-damArray[n]); //Needs to update health observer/ health bar
        }
        System.out.println("Enemy Health: " + opponent.HP);

        if (opponent.HP == 0) {
            endBattle();
        }else {
            enemyAttack();
        }

    }

    public static void endBattle() {
        Main.character.playMP = 100;

        if(Main.character.playHP == 0){
        System.out.println("You died.");
        battleControl.endBattle();
        }else if(opponent.HP == 0){
        System.out.println("Enemy died.");
        battleControl.endBattle();
        }else {
        System.out.println("Error endBattle() was incorrectly called.");

    }


    }
}
