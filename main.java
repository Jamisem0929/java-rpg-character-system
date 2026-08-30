public class Main{
    public static void main(String[] args){
        
        GameCharacter[] characters = {
            new Warrior("John",  100, 1, 150),
            new Mage("Ethan", 100, 1, 200),
            new Warrior("Asta" , 100, 1, 200)
        };
        for (GameCharacter character : characters) {
            character.attack();
            System.out.println(character.getHealth());
            System.out.println(character.getName());
            System.out.println(character.getLevel());
        }
        GameCharacter found = findCharacter(characters , "Ethan");
        if (found != null){
            System.out.println("Found " + found.getName());
        }
        else {
            System.out.println("Character not found");
        }
    
    }
    public static GameCharacter findCharacter(GameCharacter[] characters, String targetName){
        for (GameCharacter character: characters) {
            if (character.getName().equalsIgnoreCase(targetName)){
                return character;
            }
            
            
        }
        return null;
    }
}