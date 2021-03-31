import java.util.Scanner;

class Temp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Title myt = new Title();
        myt.setTitle(input.nextLine());
        System.out.println("Title : "+myt.getTitle());
        }
    
}