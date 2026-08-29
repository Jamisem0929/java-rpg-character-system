public class Warrior extends GameCharacter{
    //Warrior variables
    private int strength;
    //Warrior constructor
    Warrior(String name, int health, int level, int strength){
        super(name , health , level);
        this.strength = strength;
        
    }
    //Warrior getter
    public int getStrength(){
        return strength;
    }
    //Warrior attack 
    @Override
    void attack(){
        System.out.printf("%s attacks with a sword%n" , this.getName());
        
    }
}