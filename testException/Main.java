/*import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        System.out.println("Thred : "+Thread.currentThread().getName());
        System.out.println("Please input int :");
        int x = scInterger();
        System.out.println("Success value : "+x);
    }
    public static int scInterger(){
        Scanner scanner = new Scanner(System.in);
        int result;
        try{
            result = Integer.parseInt(scanner.nextLine());
            return result;
        }
        catch(NumberFormatException e){
            System.out.println("Number exception!");
            return scInterger();    
        }
        catch (Exception e ){

            System.out.println("Invalid input!");
            return scInterger();
            
        }
        

    }
}*/