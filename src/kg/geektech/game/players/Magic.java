package kg.geektech.game.players;


import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero{
    public Magic(int health, int damage,String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(20);
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - (this.getDamage() + coeff));
        }
        System.out.println("Heroes hits critically "
                + (this.getDamage() + coeff));
    }
}
