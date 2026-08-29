public class main{
    public static void main(String[] args){
        String targetName= "";
        
        GameCharacter[] characters = {
            new Warrior("John",  100, 1, 150),
            new Mage("Ethan", 100, 1, 200),
            new Warrior("Asta" , 100, 1, 200)
        };
        for (GameCharacter character : characters) {
            character.attack();
            System.out.println(character.getHealth());
            System.out.println(character.getName());
        }
    }
}