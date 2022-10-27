package JS6_7_Inheri_Polymorph.Tugas2;

public class HeroStrength extends Hero{
    String type = "Strength";

    public HeroStrength() {
    }

    public HeroStrength(String name, double attackPower, double health) {
        super(name, attackPower, health);
    }

    public void takeDamage(double damage){
        System.out.println(this.name + " receive half damage " + damage + " -> " + 0.5*damage);
        this.health = this.health - 0.5 * damage;
    }


    public void display(){
        super.display();
        System.out.println("Type : " + this.type);
    }
}
