/*
Sprites: These are very low priority. If anyone comes across some "Slash" or "Magic strike"
image or sprite, try to save it as we may use it in animations.
 */
public class battle {

    dungeon x1 = new dungeon();

    dungeon x2 = new dungeon();

    static entEnemy opponent = dungeon.lvl0E;



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
    if(Main.character.playHP == 0){
        System.out.println("You died.");
        }else if(opponent.HP == 0){
        System.out.println("Enemy died.");
        }else {
        System.out.println("Error endBattle() was incorrectly called.");

    }

    }
}
