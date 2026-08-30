public class Main{
    public static void main(String[] args){
        
        GameCharacter[] characters = {
            new Warrior("John",  100, 1, 150),
            new Mage("Ethan", 200, 1, 200),
            new Warrior("Asta" , 100, 1, 200)
        };
        for (GameCharacter character : characters) {
            character.attack();
            System.out.println("Health: " + character.getHealth());
            System.out.println("Name: " + character.getName());
            System.out.println("Level: " + character.getLevel());
        }
        GameCharacter found = findCharacter(characters , "ethan");
        if (found != null){
            System.out.println("Found " + found.getName());
        }
        else {
            System.out.println("Character not found");
        }
        GameCharacter highest = findHighestHealth(characters);
        System.out.println("Highest health: " + highest.getName());
        System.out.println("Characters above 100 Health: " + countAboveHealth(characters , 100));
        System.out.println("Ethan reversed: " + reverseName("Ethan"));
    }
    public static GameCharacter findCharacter(GameCharacter[] characters, String targetName){
        for (GameCharacter character: characters) {
            if (character.getName().equalsIgnoreCase(targetName)){
                return character;
            }
        }
        return null;
    }
    public static GameCharacter findHighestHealth(GameCharacter[] characters){
        int highestHealth = characters[0].getHealth();
        int highestIndex = 0;
        for (int i = 1; i < characters.length; i++){
             if (characters[i].getHealth() > highestHealth){
             highestHealth = characters[i].getHealth();
             highestIndex = i;
            }
        }
        return characters[highestIndex];
    }
    public static int countAboveHealth(GameCharacter[] characters, int amount){
        int count = 0;
        for (int i = 0; i < characters.length; i++){
            if (characters[i].getHealth() > amount){
                count++;
            }
        }
        return count;
    }
    public static String reverseName(String name){
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--){
            reversedString = reversedString + name.charAt(i);
        }
        return reversedString;
    }
}