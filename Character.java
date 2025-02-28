package Areana;

public class Character {
    String  name;
    int health;
    int attackPower;
    int defence;
    int speed;


      public Character (String name,int health,int attack_powe,int denfence,int speed) {
      this.name=name;
      this.health = health;
      this.attackPower = attackPower;
      this.defence = defence;
      this.speed = speed;
      }
      public void attack(Character target){

      }
    public void take_damage(int amount){
        health -= amount;
    }
    public boolean is_alive(){
       return health > 0;
    }
}
 class wipro extends Character {
    public wipro (String name,int health,int attack_powe,int denfence,int speed){
        super(name, health, attack_powe, denfence, speed);
    }
    }

 