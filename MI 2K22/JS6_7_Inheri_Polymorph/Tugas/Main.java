package JS6_7_Inheri_Polymorph.Tugas2;

public class Main {
    public static void main(String[] args) {

        Hero hero9 = new Hero();
        hero9.name = "Ultraman";
        hero9.attackPower = 50;
        hero9.health = 50;

        HeroStrength hero8 = new HeroStrength();
        hero8.name = "Kaibutsu";
        hero8.attackPower = 20;
        hero8.health = 100;

        hero9.display();
        hero8.display();

        hero8.attack(hero9);
        hero9.attack(hero8);

        hero9.display();
        hero8.display();

        Hero hero1 = new Hero("Tanjiro",10,100);
        HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}
