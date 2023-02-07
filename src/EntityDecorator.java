public class EntityDecorator implements Entity{
    int HP;
    int entityLvL;
    int entDamage;

    @Override
    public void changeHP(int change) {
        HP = HP + change;
    }

    @Override
    public int calDamage(EntityDecorator Man) { // may change var name
        int endDam = Man.entDamage * entityLvL; //Calculations will change
        return(endDam);
    }


}
