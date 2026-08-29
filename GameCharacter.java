public class GameCharacter{
    //parent variables
    private String name;
    private int health;
    private int level;
    //parent constructor
    GameCharacter(String name, int health, int level){
        this.name = name;
        if (health >= 0){
            this.health = health;
        } else {
            this.health = 0;
        }
        this.level = level;
    }
    //methods
    void attack(){
        System.out.printf("Character attacks%n");
    }
    
    void takeDamage(int amount){
        if (amount <= 0 ){
            
        } else if (health - amount <= 0){
            health = 0;
        } else {
            health = health - amount;
        }
    }
    
    void heal(int amount){
        if (amount > 0 ){
            health = health + amount;
        }
    }
    //getter
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getLevel(){
        return level;
    }
}