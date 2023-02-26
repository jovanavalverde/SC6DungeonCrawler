import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/*
Sprites: Multiple small sprites of a sword, two daggers, and a magic staff. (If you find
any extra sprites of a sword and shield that be useful as well.)
 */
public class itemWeapon extends itemGearDecorator {

    int[] damRange = new int[2];//Once assigned, damRange[0] must be minimum damage and damRange[1] must be maximum.
    String weaponType;


    public void setStats(int damMin, int damMax, String type, Image sprite){
        this.damRange[0] = damMin;
        this.damRange[1] = damMax;
        this.weaponType = type;//Can only be assigned as "sword", "daggers", "staff".
        this.itemSprite = sprite;

    }


    public int calItemDamage(){//Ambiguous method to find individual strike damage by calling on the ranCalculator in Main.
        int calDam = Main.ranCal(damRange[0],damRange[1]);
        return calDam;
    }
}
