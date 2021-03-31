
public class Main{
    
    public static void main(String[] args) {
        Edible[] ed = {new Apple(),new Chicken()};
        for (int i = 0; i < ed.length; i++) {
            System.out.println("what's up");
            ed[i].howToEat();
        }
    }
}