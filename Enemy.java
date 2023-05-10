public class Enemy extends Character {
    
    private int damage;

    Enemy(String nama, int hp, int damage){
        super(nama, hp);
        this.damage = damage;
    }

    public void attack(Character c){
        System.out.println(super.getNama() + " attacks " + c.getNama() );
       
    }

    public void move (){
        System.out.println(super.getNama() +" move");
    }
    public void move(int step){
        System.out.println(super.getNama()+" move in " + step + " step");
    }
}
