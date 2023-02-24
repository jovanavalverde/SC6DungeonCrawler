public class dungeon {
    //This whole class may be deleted depending on how Java FX is going to be built.



    //The following code may be moved to a new class or deleted.
    //All values in the "create" methods will be changed in accordance to balancing
    public void createWeapons(player player){
        if (player.playClass == "mage"){
            itemWeapon lvl0W = new itemWeapon(20,30,"staff");
            itemWeapon lvl1W = new itemWeapon(30,40,"staff");
            itemWeapon lvl2W = new itemWeapon(40,50,"staff");
            itemWeapon lvl3W = new itemWeapon(50,60,"staff");
            itemWeapon lvl4W = new itemWeapon(60,70,"staff");
        } else if (player.playClass == "warrior"){
            itemWeapon lvl0W = new itemWeapon(10,20,"sword");
            itemWeapon lvl1W = new itemWeapon(20,30,"sword");
            itemWeapon lvl2W = new itemWeapon(30,40,"sword");
            itemWeapon lvl3W = new itemWeapon(40,50,"sword");
            itemWeapon lvl4W = new itemWeapon(50,60,"sword");
        }else if (player.playClass == "rogue"){
            itemWeapon lvl0W = new itemWeapon(5,10,"daggers");
            itemWeapon lvl1W = new itemWeapon(10,15,"daggers");
            itemWeapon lvl2W = new itemWeapon(15,20,"daggers");
            itemWeapon lvl3W = new itemWeapon(20,25,"daggers");
            itemWeapon lvl4W = new itemWeapon(25,30,"daggers");
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public void createArmor(player player){
        if (player.playClass == "mage"){
            itemArmor lvl0A = new itemArmor(25, "robe");
            itemArmor lvl1A = new itemArmor(35, "robe");
            itemArmor lvl2A = new itemArmor(45, "robe");
            itemArmor lvl3A = new itemArmor(55, "robe");
            itemArmor lvl4A = new itemArmor(65, "robe");
        } else if (player.playClass == "warrior"){
            itemArmor lvl0A = new itemArmor(50, "light");
            itemArmor lvl1A = new itemArmor(60, "light");
            itemArmor lvl2A = new itemArmor(70, "light");
            itemArmor lvl3A = new itemArmor(80, "light");
            itemArmor lvl4A = new itemArmor(90, "light");
        }else if (player.playClass == "rogue"){
            itemArmor lvl0A = new itemArmor(80, "heavy");
            itemArmor lvl1A = new itemArmor(90, "heavy");
            itemArmor lvl2A = new itemArmor(100, "heavy");
            itemArmor lvl3A = new itemArmor(110, "heavy");
            itemArmor lvl4A = new itemArmor(120, "heavy");
        }else {
            System.out.println("playClass not set to correct value.");
        }
    }

    public void createEnemies(){
        entEnemy lvl0E = new entEnemy(200,10,30);
        entEnemy lvl1E = new entEnemy(300,20,30);
        entEnemy lvl2E = new entEnemy(400,30,40);
        entEnemy lvl3E = new entEnemy(500,40,50);
        entEnemy lvl4E = new entEnemy(600,50,60);
    }

    public void createBoss(){
        entBoss badMan = new entBoss(1000, 100, 200);
    }

}
