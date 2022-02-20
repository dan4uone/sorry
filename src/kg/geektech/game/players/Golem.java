package kg.geektech.game.players;


public class Golem extends Hero{
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int bd = boss.getDamage()/5;
        int hj = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                hj++;
                heroes[i].setHealth(heroes[i].getHealth()+bd);
                this.setHealth(this.getHealth() -bd * hj);
            }
        }
        System.out.println("Stone took damage" + bd*hj);

    }
}
