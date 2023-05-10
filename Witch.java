public class Witch extends Enemy {
    
    private int spell;

    Witch(String nama, int hp, int damage, int spell){
        super(nama, hp, damage);
        this.spell = spell;
    }

    public void attack(Character c){
        System.out.println(super.getNama() + " cast spell on " + c.getNama() );
         
    }
    public void move(){
        System.out.println("Witch move");
    }
}
