public class Mage extends GameCharacter{
    //Mage variables
    private int mana;
    //Mage constructor
    Mage(String name, int health, int level, int mana){
        super(name , health , level);
        this.mana = mana;
    }
    //Mage getter
    public int getMana(){
        return mana;
    }
    //Mage attack
    @Override
    void attack(){
        System.out.printf("%s casts a spell %n" , this.getName());
        
    }
}