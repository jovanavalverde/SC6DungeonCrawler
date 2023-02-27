import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class dungeon {
/*This Class will hold all the item and enemy objects, as well as the methods to set their stats.*/


//--------------------Weapon Objects--------------------
    static itemWeapon lvl0W = new itemWeapon();
    static itemWeapon lvl1W = new itemWeapon();
    static itemWeapon lvl2W = new itemWeapon();
    static itemWeapon lvl3W = new itemWeapon();
    static itemWeapon lvl4W = new itemWeapon();
//--------------------Armor Objects--------------------
    static itemArmor lvl0A = new itemArmor();
    static itemArmor lvl1A = new itemArmor();
    static itemArmor lvl2A = new itemArmor();
    static itemArmor lvl3A = new itemArmor();
    static itemArmor lvl4A = new itemArmor();
//--------------------Enemy Objects--------------------

    /*Enemy constructors and objects need to be reconfigured like the armor and weapons.*/

//--------------------XXX--------------------



//--------------------All values in the "create" methods will be changed in accordance to balancing--------------------
    public static void createWeapons(player player){
        /*This method detects the players class then sets the stats of the weapons in accordance.*/
        if (player.playClass == "mage"){
            lvl0W.setStats(20,30,"staff",(new Image("testSprite2.png")));
            lvl1W.setStats(30,40,"staff",(new Image("testSprite2.png")));
            lvl2W.setStats(40,50,"staff",(new Image("testSprite2.png")));
            lvl3W.setStats(50,60,"staff",(new Image("testSprite2.png")));
            lvl4W.setStats(60,70,"staff",(new Image("testSprite2.png")));
        } else if (player.playClass == "warrior"){
            lvl0W.setStats(10,20,"sword",(new Image("testSprite3.png")));
            lvl1W.setStats(20,30,"sword",(new Image("testSprite3.png")));
            lvl2W.setStats(30,40,"sword",(new Image("testSprite3.png")));
            lvl3W.setStats(40,50,"sword",(new Image("testSprite3.png")));
            lvl4W.setStats(50,60,"sword",(new Image("testSprite3.png")));
        }else if (player.playClass == "rogue"){
            lvl0W.setStats(5,10,"daggers",(new Image("testSprite4.png")));
            lvl1W.setStats(10,15,"daggers",(new Image("testSprite4.png")));
            lvl2W.setStats(15,20,"daggers",(new Image("testSprite4.png")));
            lvl3W.setStats(20,25,"daggers",(new Image("testSprite4.png")));
            lvl4W.setStats(25,30,"daggers",(new Image("testSprite4.png")));
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public static void createArmor(player player){
        /*This method detects the players class then sets the stats of the armor in accordance.*/
        if (player.playClass == "mage"){
            lvl0A.setStats(25, "robe",(new Image("testSprite2.png")));
            lvl1A.setStats(35, "robe",(new Image("testSprite2.png")));
            lvl2A.setStats(45, "robe",(new Image("testSprite2.png")));
            lvl3A.setStats(55, "robe",(new Image("testSprite2.png")));
            lvl4A.setStats(65, "robe",(new Image("testSprite2.png")));
        } else if (player.playClass == "warrior"){
            lvl0A.setStats(50, "light",(new Image("testSprite3.png")));
            lvl1A.setStats(60, "light",(new Image("testSprite3.png")));
            lvl2A.setStats(70, "light",(new Image("testSprite3.png")));
            lvl3A.setStats(80, "light",(new Image("testSprite3.png")));
            lvl4A.setStats(90, "light",(new Image("testSprite3.png")));
        }else if (player.playClass == "rogue"){
            lvl0A.setStats(80, "heavy",(new Image("testSprite4.png")));
            lvl1A.setStats(90, "heavy",(new Image("testSprite4.png")));
            lvl2A.setStats(100, "heavy",(new Image("testSprite4.png")));
            lvl3A.setStats(110, "heavy",(new Image("testSprite4.png")));
            lvl4A.setStats(120, "heavy",(new Image("testSprite4.png")));
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public static void createEnemies(){
        entEnemy lvl0E = new entEnemy(200,10,30,(new Image("testSprite2.png")));
        entEnemy lvl1E = new entEnemy(300,20,30,(new Image("testSprite2.png")));
        entEnemy lvl2E = new entEnemy(400,30,40,(new Image("testSprite2.png")));
        entEnemy lvl3E = new entEnemy(500,40,50,(new Image("testSprite2.png")));
        entEnemy lvl4E = new entEnemy(600,50,60,(new Image("testSprite2.png")));
    }

    public static void createBoss(){
        entBoss badMan = new entBoss(1000, 100, 200,(new Image("testSprite2.png")));
    }



}
