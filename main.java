public class main{
    public static void main(String[] args){
        GameCharacter p1 = new Mage("Ethan" , 100, 1 , 150);
        GameCharacter p2 = new Warrior("John", 100, 1, 100);
        
        System.out.println(p1.getName());
        System.out.println(p1.getHealth());
        System.out.println(p1.getLevel());
        System.out.println(p2.getName());
        System.out.println(p2.getHealth());
        System.out.println(p2.getLevel());
    }
}