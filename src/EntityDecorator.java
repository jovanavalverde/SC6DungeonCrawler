public class EntityDecorator implements Entity{
    int HP;
    int entityLvL;
    int entDamage;

    @Override
    public void changeHP(int change) {
        HP = HP + change;
    }

    @Override
    public int[] calDamage(EntityDecorator Man) { //Contents may be moved to Enemy.java and Boss.java
        int[] endDam = new int[1];
        endDam[0] = Man.entDamage * entityLvL; //Calculations will change
        return(endDam);
    }


}
