public class Hero extends Character {
    
    private int damage;

    Hero(String nama, int hp, int damage){
        super(nama, hp);
        this.damage = damage;
    }

    public void attack(Character c){
        System.out.println(super.getNama() + " attacks " + c.getNama());
       
    }

    public void move(){
        System.out.println(super.getNama() + " move");
    }

    public void move(String direction){
        System.out.println(super.getNama() + " move to " + direction);
    }

}
