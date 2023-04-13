/*
Sprites: These are very low priority. If anyone comes across some "Slash" or "Magic strike"
image or sprite, try to save it as we may use it in animations.
 */

public class battle {


    static entEnemy opponent = dungeon.lvl0E;
    private static controllerBattle battleControl;

    static int damTaken = 0;
    public static  int turnCount = 0;

    public static void setApp(controllerBattle battleControl){
        /*This method sets the app variable to appDungGame application so the window can be changed.
        And sets invControl to the inventoryScreen.fxml controller, so it can be altered from this controller.*/

        battle.battleControl = battleControl;
    }


    public static void enemyAttack() {
        int[] damArray = opponent.calDamage();

        //Main.timeDelay(1000);
        Main.character.changeHP(-damArray[0]);
        damTaken = (int)(damArray[0]/(Main.character.eqItemArmor.armorPT*0.1));

        battleControl.updateBattleText(2, "Enemy", damTaken);
        //System.out.println("Health: " + Main.character.playHP);
        battleControl.updateText();

        if (Main.character.playHP == 0) {
            endBattle();
        }
    }

    public static void playerAttack(){
        turnCount += 1;
        battleControl.updateBattleText(7,turnCount);

        int[] damArray = Main.character.calDamage();

        for(int n = 0; n < damArray.length; n++ ){
            opponent.changeHP(-damArray[n]); //Needs to update health observer/ health bar
            battleControl.updateBattleText(1, damArray[n]);
            battleControl.updateBars();
        }

        //System.out.println("Enemy Health: " + opponent.HP);

        if (opponent.HP == 0) {
            endBattle();
        }else {
            enemyAttack();
        }

    }

    public static void playerSpecialAttack(){
        turnCount += 1;
        battleControl.updateBattleText(7,turnCount);

        int[] damArray = Main.character.calDamage(); //needs to be changed to calSpecialDamage() when method is created

        for(int n = 0; n < damArray.length; n++ ){
            opponent.changeHP(-damArray[n]); //Needs to update health observer/ health bar
            battleControl.updateBattleText(1, damArray[n]);
        }

        //System.out.println("Enemy Health: " + opponent.HP);

        if (opponent.HP == 0) {
            endBattle();
        }else {
            enemyAttack();
        }
    }

    public static void endBattle() {
        turnCount = 0;
        Main.character.playMP = 100;
    if(Main.character.playHP == 0){
        System.out.println("You died.");
        opponent.HP = opponent.maxHP;
        battleControl.endBattle();
        }else if(opponent.HP == 0){
        System.out.println("Enemy died.");

        opponent.addLoot();
        Main.character.playerPotions[0]++;
        Main.character.playerPotions[1]++;

        battleControl.endBattle();
        }else {
        System.out.println("Error endBattle() was incorrectly called.");

    }


    }
}
