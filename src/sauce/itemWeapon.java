import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/*
Sprites: Multiple small sprites of a sword, two daggers, and a magic staff. (If you find
any extra sprites of a sword and shield that be useful as well.)
 */
public class itemWeapon extends itemGearDecorator {


    int[] damRange = new int[2];//Once assigned, damRange[0] must be minimum damage and damRange[1] must be maximum.
    String weaponType;//Can only be assigned as "sword", "daggers", "staff".

/*Due to loading errors, the constructor as been turned into a method to be later called after the instances are made.*/
    public void setStats(int damMin, int damMax, String type, Image sprite){
        /*This method takes several parameters that assigns the damage range, weapon type, and sprite to the instance*/
        this.damRange[0] = damMin;
        this.damRange[1] = damMax;
        this.weaponType = type;
        this.itemSprite = sprite;

    }


    public int calItemDamage(){
        /*Method to find individual strike damage by calling on the ranCalculator in Main.*/
        int calDam = Main.ranCal(damRange[0],damRange[1]);
        return calDam;
    }
}
