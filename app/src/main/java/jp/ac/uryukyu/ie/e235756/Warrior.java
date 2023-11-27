package jp.ac.uryukyu.ie.e235756;

public class Warrior extends Hero {
    public Warrior(String _name, int maximumHP ,int _attack){
        super(_name, maximumHP, _attack);
    }

    public void attackWithWeponSkill(LivingThing kyara){
        if(!(isDead())){
            double attack = getAttack();
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！%n", getName(), kyara.getName(), damage);
            kyara.wounded(damage);
        }
    }
}