import javafx.scene.image.Image;

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
    static entEnemy lvl0E = new entEnemy();
    static entEnemy lvl1E = new entEnemy();
    static entEnemy lvl2E = new entEnemy();
    static entEnemy lvl3E = new entEnemy();
    static entEnemy lvl4E = new entEnemy();
//--------------------Room--------------------
public static room[] allRooms = new room[14];
//--------------------XXX--------------------



//--------------------All values in the "create" methods will be changed in accordance to balancing--------------------
    public static void createWeapons(player player){
        /*This method detects the players class then sets the stats of the weapons in accordance.*/
        if (player.playClass == "mage"){
            lvl0W.setStats(30,40,"staff",(new Image("testSprites/testStaff0.png")));
            lvl1W.setStats(40,50,"staff",(new Image("testSprites/testStaff1.png")));
            lvl2W.setStats(50,60,"staff",(new Image("testSprites/testStaff2.png")));
            lvl3W.setStats(60,70,"staff",(new Image("testSprites/testStaff3.png")));
            lvl4W.setStats(75,85,"staff",(new Image("testSprites/testStaff4.png")));
        } else if (player.playClass == "warrior"){
            lvl0W.setStats(10,20,"sword",(new Image("testSprites/sword0.png")));
            lvl1W.setStats(20,30,"sword",(new Image("testSprites/sword1.png")));
            lvl2W.setStats(30,40,"sword",(new Image("testSprites/sword2.png")));
            lvl3W.setStats(40,50,"sword",(new Image("testSprites/sword3.png")));
            lvl4W.setStats(50,60,"sword",(new Image("testSprites/sword4.png")));
        }else if (player.playClass == "rogue"){
            lvl0W.setStats(10,15,"daggers",(new Image("testSprites/daggers0.png")));
            lvl1W.setStats(15,20,"daggers",(new Image("testSprites/daggers1.png")));
            lvl2W.setStats(20,25,"daggers",(new Image("testSprites/daggers2.png")));
            lvl3W.setStats(25,30,"daggers",(new Image("testSprites/daggers3.png")));
            lvl4W.setStats(30,35,"daggers",(new Image("testSprites/daggers4.png")));
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public static void createArmor(player player){
        /*This method detects the players class then sets the stats of the armor in accordance.*/
        if (player.playClass == "mage"){
            lvl0A.setStats(25, "robe",(new Image("testSprites/testRobes0.png")));
            lvl1A.setStats(35, "robe",(new Image("testSprites/testRobes1.png")));
            lvl2A.setStats(45, "robe",(new Image("testSprites/testRobes2.png")));
            lvl3A.setStats(55, "robe",(new Image("testSprites/testRobes3.png")));
            lvl4A.setStats(75, "robe",(new Image("testSprites/testRobes4.png")));
        } else if (player.playClass == "rogue"){
            lvl0A.setStats(40, "light",(new Image("testSprites/light0.png")));
            lvl1A.setStats(50, "light",(new Image("testSprites/light1.png")));
            lvl2A.setStats(60, "light",(new Image("testSprites/light2.png")));
            lvl3A.setStats(70, "light",(new Image("testSprites/light3.png")));
            lvl4A.setStats(80, "light",(new Image("testSprites/light4.png")));
        }else if (player.playClass == "warrior"){
            lvl0A.setStats(80, "heavy",(new Image("testSprites/heavy0.png")));
            lvl1A.setStats(90, "heavy",(new Image("testSprites/heavy1.png")));
            lvl2A.setStats(100, "heavy",(new Image("testSprites/heavy2.png")));
            lvl3A.setStats(110, "heavy",(new Image("testSprites/heavy3.png")));
            lvl4A.setStats(120, "heavy",(new Image("testSprites/heavy4.png")));
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public static void createEnemies(){
        item[] lvl0L = new item[2];//This is empty for now due to the lvl0 weapon and armor being pre-acquired.
        item[] lvl1L = new item[2];
        lvl1L[0] = lvl1W;
        lvl1L[1] = lvl1A;
        item[] lvl2L = new item[2];
        lvl2L[0] = lvl2W;
        lvl2L[1] = lvl2A;
        item[] lvl3L = new item[2];
        lvl3L[0] = lvl3W;
        lvl3L[1] = lvl3A;
        item[] lvl4L = new item[2];
        lvl4L[0] = lvl4W;
        lvl4L[1] = lvl4A;
        lvl0E.setStats(200,10,20,(new Image("realSprites/slime.png")),lvl0L);
        lvl1E.setStats(300,15,25,(new Image("realSprites/ghoul.png")),lvl1L);
        lvl2E.setStats(400,30,40,(new Image("realSprites/goblin.png")),lvl2L);
        lvl3E.setStats(500,40,50,(new Image("realSprites/Armored_Skeleton.png")),lvl3L);
        lvl4E.setStats(600,50,60,(new Image("realSprites/boss.png")),lvl4L);
    }
    public static void testRun(){
        lvl0E.HP = 1;
        lvl1E.HP = 1;
        lvl2E.HP = 1;
        lvl3E.HP = 1;
        lvl4E.HP = 1;
    }

    public static void createRooms(){
        //For testing purposes, all rooms are filled with lvl0E enemy.
        allRooms[0] = new room(0,0,0,55,581);
        allRooms[1] = new room(1,0,1,55,458);
        allRooms[2] = new room(lvl0E,2,0,2,54,335);
        allRooms[3] = new room(3,0,3,54,212);
        allRooms[4] = new room(lvl1E,4,0,4,54,89);
        allRooms[5] = new room(5,1,4,177,89);
        allRooms[6] = new room(lvl2E,6,2,4,300,89);
        allRooms[7] = new room(7,3,4,423,89);
        allRooms[8] = new room(lvl3E,8,4,4,546,89);
        allRooms[9] = new room(9,5,4,669,89);
        allRooms[10] = new room(lvl4E,10,6,4,792,89);
        allRooms[11] = new room(11,6,3,793,212);
        allRooms[12] = new room(12,6,2,792,337);



    }

    public static void createBoss(){
        entBoss badMan = new entBoss(1000, 100, 200,(new Image("realSprites/boss.png")));
    }



}
