package JS6_7_Inheri_Polymorph.Tugas2;

public class Hero {
    public String name;
    public double attackPower, health;

    public Hero() {
    }

    public Hero(String name, double attackPower, double health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    public void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }

    public void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    }

    public void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
}
