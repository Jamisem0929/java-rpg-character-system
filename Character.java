class Character{
    //parent variables
    private String name;
    private int health;
    private int level;
    //parent constructor
    Character(String name, int health, int level){
        this.name = name;
        if (health >= 0){
            this.health = health;
        }
        this.level = level;
    }
    void attack(){
        System.out.printf("Character attacks%n");
    }
    //getter
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getlevel(){
        return level;
    }
}

class Warrior extends Character{
    //Warrior variables
    private int strength;
    //Warrior constructor
    Warrior(String name, int health, int level, int strength){
        super(name , health , level);
        this.strength = strength;
        
    }
    //Warrior attack 
    @Override
    void attack(){
        System.out.printf("%s attacks with a sword%n" , this.getName());
        
    }
}
class Mage extends Character{
    //Mage variables
    private int mana;
    //Mage constructor
    Mage(String name, int health, int level, int mana){
        super(name , health , level);
        this.mana = mana;
    }
    //Mage attack
    @Override
    void attack(){
        System.out.printf("%s casts a spell %n" , this.getName());
        
    }
}