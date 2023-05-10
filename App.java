public class Main {
    public static void main(String[] args) {

        //static polymorphism pada kelas Hero
        System.out.println("static polymorphism pada kelas Hero");
        Hero hero = new Hero("Superman", 0, 0);
        hero.move();
        hero.move("South");
        System.out.println();

        //static polymorphism pada kelas Enemy
        System.out.println("static polymorphism pada kelas Enemy");
        Enemy enemy = new Enemy("Batman", 0, 0);
        enemy.move();
        enemy.move(2);
        System.out.println();

        //dynamic polymorphism dari character ke class lain
        System.out.println("dynamic polymorphism dari character ke class lain");
        Character char1 = new Hero("Naruto", 0, 0);
        Character char2 = new Enemy("Sasuke", 0, 0);
        Character char3 = new Fighter("Itachi", 0, 0, 0);
        Character char4 = new Witch("Madara", 0, 0, 0);

        char1.attack(char2);
        char2.attack(char1);
        char3.attack(char2);
        char4.attack(char1);

        System.out.println();

        //dynamic polymorphism and casting
        Character witch = new Witch("Merlin", 0, 0, 0);
        witch.attack(witch);
        // downcasting ke objek Fighter
        Fighter fighter = (Fighter) witch;
        fighter.attack(char1); 

    }
}
