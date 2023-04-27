import javafx.scene.image.Image;

public class dungeon {
/*This Class will hold all the item and enemy objects, as well as the methods to set their stats.*/


//--------------------Weapon Objects--------------------
    static itemWeapon lvl0W = new itemWeapon();
    static itemWeapon lvl1W = new itemWeapon();
    static itemWeapon lvl2W = new itemWeapon();
    static itemWeapon lvl3W = new itemWeapon();
    static itemWeapon lvl4W = new itemWeapon();
    static itemWeapon lvl5W = new itemWeapon();
    static itemWeapon lvl6W = new itemWeapon();
    static itemWeapon lvl7W = new itemWeapon();
    static itemWeapon lvl8W = new itemWeapon();
    static itemWeapon lvl9W = new itemWeapon();
    static itemWeapon lvl10W = new itemWeapon();
    static itemWeapon lvl11W = new itemWeapon();
//--------------------Armor Objects--------------------
    static itemArmor lvl0A = new itemArmor();
    static itemArmor lvl1A = new itemArmor();
    static itemArmor lvl2A = new itemArmor();
    static itemArmor lvl3A = new itemArmor();
    static itemArmor lvl4A = new itemArmor();
    static itemArmor lvl5A = new itemArmor();
    static itemArmor lvl6A = new itemArmor();
    static itemArmor lvl7A = new itemArmor();
    static itemArmor lvl8A = new itemArmor();
    static itemArmor lvl9A = new itemArmor();
    static itemArmor lvl10A = new itemArmor();
    static itemArmor lvl11A = new itemArmor();
//--------------------Enemy Objects--------------------
    static entEnemy lvl0E = new entEnemy();
    static entEnemy lvl1E = new entEnemy();
    static entEnemy lvl2E = new entEnemy();
    static entEnemy lvl3E = new entEnemy();
    static entEnemy lvl4E = new entEnemy();
    static entEnemy lvl5E = new entEnemy();
    static entEnemy lvl6E = new entEnemy();
    static entEnemy lvl7E = new entEnemy();
    static entEnemy lvl8E = new entEnemy();
    static entEnemy lvl9E = new entEnemy();
    static entEnemy lvl10E = new entEnemy();
    static entEnemy lvl11E = new entEnemy();
//--------------------Room--------------------
public static room[] allRooms;
public static room[] firstFloor = new room[13];
public static room[] secondFloor = new room[17];
//--------------------XXX--------------------



//--------------------All values in the "create" methods will be changed in accordance to balancing--------------------
    public static void createWeapons(player player){
        /*This method detects the players class then sets the stats of the weapons in accordance.*/
        if (player.playClass == "mage"){
            lvl0W.setStats(30,40,"staff",(new Image("testSprites/Staff0.png")));
            lvl1W.setStats(40,50,"staff",(new Image("testSprites/Staff1.png")));
            lvl2W.setStats(50,60,"staff",(new Image("testSprites/Staff2.png")));
            lvl3W.setStats(60,70,"staff",(new Image("testSprites/Staff3.png")));
            lvl4W.setStats(75,85,"staff",(new Image("testSprites/Staff4.png")));
            lvl5W.setStats(85,95,"staff",(new Image("testSprites/Staff5.png")));
            lvl6W.setStats(95,105,"staff",(new Image("testSprites/Staff6.png")));
            lvl7W.setStats(105,115,"staff",(new Image("testSprites/Staff7.png")));
            lvl8W.setStats(115,125,"staff",(new Image("testSprites/Staff8.png")));
            lvl9W.setStats(125,135,"staff",(new Image("testSprites/Staff9.png")));
            lvl10W.setStats(135,145,"staff",(new Image("testSprites/Staff10.png")));
            lvl11W.setStats(150,160,"staff",(new Image("testSprites/Staff11.png")));
        } else if (player.playClass == "warrior"){
            lvl0W.setStats(10,20,"sword",(new Image("testSprites/sword0.png")));
            lvl1W.setStats(20,30,"sword",(new Image("testSprites/sword1.png")));
            lvl2W.setStats(30,40,"sword",(new Image("testSprites/sword2.png")));
            lvl3W.setStats(40,50,"sword",(new Image("testSprites/sword3.png")));
            lvl4W.setStats(50,60,"sword",(new Image("testSprites/sword4.png")));
            lvl5W.setStats(60,70,"sword",(new Image("testSprites/sword5.png")));
            lvl6W.setStats(70,80,"sword",(new Image("testSprites/sword6.png")));
            lvl7W.setStats(80,90,"sword",(new Image("testSprites/sword7.png")));
            lvl8W.setStats(90,100,"sword",(new Image("testSprites/sword8.png")));
            lvl9W.setStats(100,110,"sword",(new Image("testSprites/sword9.png")));
            lvl10W.setStats(110,120,"sword",(new Image("testSprites/sword10.png")));
            lvl11W.setStats(140,150,"sword",(new Image("testSprites/sword11.png")));
        }else if (player.playClass == "rogue"){
            lvl0W.setStats(10,15,"daggers",(new Image("testSprites/daggers0.png")));
            lvl1W.setStats(15,20,"daggers",(new Image("testSprites/daggers1.png")));
            lvl2W.setStats(20,25,"daggers",(new Image("testSprites/daggers2.png")));
            lvl3W.setStats(25,30,"daggers",(new Image("testSprites/daggers3.png")));
            lvl4W.setStats(30,35,"daggers",(new Image("testSprites/daggers4.png")));
            lvl5W.setStats(35,40,"daggers",(new Image("testSprites/daggers5.png")));
            lvl6W.setStats(40,45,"daggers",(new Image("testSprites/daggers6.png")));
            lvl7W.setStats(45,50,"daggers",(new Image("testSprites/daggers7.png")));
            lvl8W.setStats(50,55,"daggers",(new Image("testSprites/daggers8.png")));
            lvl9W.setStats(55,60,"daggers",(new Image("testSprites/daggers9.png")));
            lvl10W.setStats(60,65,"daggers",(new Image("testSprites/daggers10.png")));
            lvl11W.setStats(70,75,"daggers",(new Image("testSprites/daggers11.png")));
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public static void createArmor(player player){
        /*This method detects the players class then sets the stats of the armor in accordance.*/
        if (player.playClass == "mage"){
            lvl0A.setStats(25, "robe",(new Image("testSprites/Robes0.png")));
            lvl1A.setStats(35, "robe",(new Image("testSprites/Robes1.png")));
            lvl2A.setStats(45, "robe",(new Image("testSprites/Robes2.png")));
            lvl3A.setStats(55, "robe",(new Image("testSprites/Robes3.png")));
            lvl4A.setStats(75, "robe",(new Image("testSprites/Robes4.png")));
            lvl5A.setStats(85, "robe",(new Image("testSprites/Robes5.png")));
            lvl6A.setStats(95, "robe",(new Image("testSprites/Robes6.png")));
            lvl7A.setStats(105, "robe",(new Image("testSprites/Robes7.png")));
            lvl8A.setStats(115, "robe",(new Image("testSprites/Robes8.png")));
            lvl9A.setStats(125, "robe",(new Image("testSprites/Robes9.png")));
            lvl10A.setStats(135, "robe",(new Image("testSprites/Robes10.png")));
            lvl11A.setStats(155, "robe",(new Image("testSprites/Robes11.png")));
        } else if (player.playClass == "rogue"){
            lvl0A.setStats(40, "light",(new Image("testSprites/light0.png")));
            lvl1A.setStats(50, "light",(new Image("testSprites/light1.png")));
            lvl2A.setStats(60, "light",(new Image("testSprites/light2.png")));
            lvl3A.setStats(70, "light",(new Image("testSprites/light3.png")));
            lvl4A.setStats(80, "light",(new Image("testSprites/light4.png")));
            lvl5A.setStats(90, "light",(new Image("testSprites/light5.png")));
            lvl6A.setStats(100, "light",(new Image("testSprites/light6.png")));
            lvl7A.setStats(110, "light",(new Image("testSprites/light7.png")));
            lvl8A.setStats(120, "light",(new Image("testSprites/light8.png")));
            lvl9A.setStats(130, "light",(new Image("testSprites/light9.png")));
            lvl10A.setStats(140, "light",(new Image("testSprites/light10.png")));
            lvl11A.setStats(160, "light",(new Image("testSprites/light11.png")));
        }else if (player.playClass == "warrior"){
            lvl0A.setStats(80, "heavy",(new Image("testSprites/heavy0.png")));
            lvl1A.setStats(90, "heavy",(new Image("testSprites/heavy1.png")));
            lvl2A.setStats(100, "heavy",(new Image("testSprites/heavy2.png")));
            lvl3A.setStats(110, "heavy",(new Image("testSprites/heavy3.png")));
            lvl4A.setStats(120, "heavy",(new Image("testSprites/heavy4.png")));
            lvl5A.setStats(130, "heavy",(new Image("testSprites/heavy5.png")));
            lvl6A.setStats(140, "heavy",(new Image("testSprites/heavy6.png")));
            lvl7A.setStats(150, "heavy",(new Image("testSprites/heavy7.png")));
            lvl8A.setStats(160, "heavy",(new Image("testSprites/heavy8.png")));
            lvl9A.setStats(170, "heavy",(new Image("testSprites/heavy9.png")));
            lvl10A.setStats(180, "heavy",(new Image("testSprites/heavy10.png")));
            lvl11A.setStats(100, "heavy",(new Image("testSprites/heavy11.png")));
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
        item[] lvl5L = new item[2];
        lvl5L[0] = lvl5W;
        lvl5L[1] = lvl5A;
        item[] lvl6L = new item[2];
        lvl6L[0] = lvl6W;
        lvl6L[1] = lvl6A;
        item[] lvl7L = new item[2];
        lvl7L[0] = lvl7W;
        lvl7L[1] = lvl7A;
        item[] lvl8L = new item[2];
        lvl8L[0] = lvl8W;
        lvl8L[1] = lvl8A;
        item[] lvl9L = new item[2];
        lvl9L[0] = lvl9W;
        lvl9L[1] = lvl9A;
        item[] lvl10L = new item[2];
        lvl10L[0] = lvl10W;
        lvl10L[1] = lvl10A;
        item[] lvl11L = new item[2];
        lvl11L[0] = lvl11W;
        lvl11L[1] = lvl11A;//Creating loot.

        lvl0E.setStats(200,10,20,(new Image("realSprites/slime.png")),lvl0L,1);
        lvl1E.setStats(300,15,25,(new Image("realSprites/ghoul.png")),lvl1L,2);
        lvl2E.setStats(400,30,40,(new Image("realSprites/goblin.png")),lvl2L,3);
        lvl3E.setStats(500,40,50,(new Image("realSprites/Armored_Skeleton.png")),lvl3L,1);
        lvl4E.setStats(600,50,60,(new Image("realSprites/boss.png")),lvl4L,1);
        lvl5E.setStats(700,60,70,(new Image("realSprites/slime.png")),lvl5L,1);
        lvl6E.setStats(800,70,80,(new Image("realSprites/slime.png")),lvl6L,1);
        lvl7E.setStats(900,80,90,(new Image("realSprites/slime.png")),lvl7L,1);
        lvl8E.setStats(1000,90,100,(new Image("realSprites/slime.png")),lvl8L,1);
        lvl9E.setStats(1100,100,110,(new Image("realSprites/slime.png")),lvl9L,1);
        lvl10E.setStats(1200,110,120,(new Image("realSprites/slime.png")),lvl10L,1);
        lvl11E.setStats(1300,120,130,(new Image("realSprites/slime.png")),lvl11L,1);
    }
    public static void testRun(){
        lvl0E.HP = 1;
        lvl1E.HP = 1;
        lvl2E.HP = 1;
        lvl3E.HP = 1;
        lvl4E.HP = 1;
        lvl5E.HP = 1;
        lvl6E.HP = 1;
        lvl7E.HP = 1;
        lvl8E.HP = 1;
        lvl9E.HP = 1;
        lvl10E.HP = 1;
        lvl11E.HP = 1;

    }
    public static void quickTestRun(){
        lvl0E.lootCollected = true;
        lvl1E.lootCollected = true;
        lvl2E.lootCollected = true;
        lvl3E.lootCollected = true;
        lvl4E.lootCollected = true;
        lvl5E.lootCollected = true;
        lvl6E.lootCollected = true;
        lvl7E.lootCollected = true;
        lvl8E.lootCollected = true;
        lvl9E.lootCollected = true;
        lvl10E.lootCollected = true;
        lvl11E.lootCollected = true;
    }
    public static void testInv(){
        lvl1E.addLoot();
        lvl2E.addLoot();
        lvl3E.addLoot();
        lvl4E.addLoot();
        lvl5E.addLoot();
        lvl6E.addLoot();
        lvl7E.addLoot();
        lvl8E.addLoot();
        lvl9E.addLoot();
        lvl10E.addLoot();
        lvl11E.addLoot();
    }

    public static void createRooms(){
        //For testing purposes, all rooms are filled with lvl0E enemy.
        firstFloor[0] = new room(0,0,0,55,581);
        firstFloor[1] = new room(1,0,1,55,458);
        firstFloor[2] = new room(lvl0E,2,0,2,54,335);
        firstFloor[3] = new room(3,0,3,54,212);
        firstFloor[4] = new room(lvl1E,4,0,4,54,89);
        firstFloor[5] = new room(5,1,4,177,89);
        firstFloor[6] = new room(lvl2E,6,2,4,300,89);
        firstFloor[7] = new room(7,3,4,423,89);
        firstFloor[8] = new room(lvl3E,8,4,4,546,89);
        firstFloor[9] = new room(9,5,4,669,89);
        firstFloor[10] = new room(lvl4E,10,6,4,792,89);
        firstFloor[11] = new room(11,6,3,793,212);
        firstFloor[12] = new room(12,6,2,792,337);

        allRooms = firstFloor;

        secondFloor[0] = new room(0,0,0,793,311);
        secondFloor[1] = new room(lvl5E,1,0,-1,792,454);
        secondFloor[2] = new room(2,-1,-1,666,455);
        secondFloor[3] = new room(lvl7E,3,-2,-1,531,453);
        secondFloor[4] = new room(4,-3,-1,385,454);
        secondFloor[5] = new room(5,-4,-1,271,454);
        secondFloor[6] = new room(6,-4,0,271,319);
        secondFloor[7] = new room(7,-4,1,270,84);
        secondFloor[8] = new room(1.1,0,-2,791,575);
        secondFloor[9] = new room(lvl6E,1.2,-1,-2,649,577);
        secondFloor[10] = new room(3.1,-2,0,531,327);
        secondFloor[11] = new room(lvl8E,3.2,-2,1,531,191);
        secondFloor[12] = new room(3.3,-1,1,673,190);
        secondFloor[13] = new room(3.4,0,1,789,190);
        secondFloor[14] = new room(lvl9E,3.5,0,2,791,69);
        secondFloor[15] = new room(lvl11E,5.1,-5,-1,128,455);
        secondFloor[16] = new room(lvl10E,5.1,-4,-2,270,597);//5.2


    }

    public static void createBoss(){
        entBoss badMan = new entBoss(1000, 100, 200,(new Image("realSprites/boss.png")));
    }



}
