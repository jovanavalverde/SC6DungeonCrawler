public class Player implements Entity{

    int playHP;
    int armor;

    @Override
    public void changeHP(int change) {
        double bla = change/(0.5*armor);
        playHP = playHP + (int)(bla);
    }

    @Override
    public int calDamage(EntityDecorator Man) {
        return 0;
    }
}
