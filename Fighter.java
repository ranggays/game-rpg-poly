public class Fighter extends Hero {
    
    private int block;

    Fighter(String nama, int hp, int damage, int block){
        super(nama, hp, damage);
        this.block = block;
    }

    public void attack(Character c) {
       
            System.out.println(super.getNama() + " blocks " + c.getNama() + "'s attack.");
       
    }

    public void move(){
        System.out.println("Fighter move");
    }
}
