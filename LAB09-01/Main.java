import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menu(1=Circle, 2=Rectangle, 3=Triangle, 4=Exit) : ");
        int choice = Integer.parseInt(input.nextLine());
        if(choice == 1){
            
        Circle k1 = new Circle(15,"white",500);
        Circle k2 = new Circle(8,"black",100);
        Circle k3 = new Circle();
        System.out.print("\nFind the larger object using max method : ");
        ComparableCir c1 = new ComparableCir(k1.getRadius());
        ComparableCir c2 = new ComparableCir(k3.getRadius());
        System.out.println("\nAnswer : "+moreThPrint(c2.compareTo(c1)));

       /*try {
            k3 = (Circle) tellMax(k1,k2).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }*/
        System.out.print("\nCloing Rectangle c3 by using : ");
        String name1 = input.nextLine();
        if(name1.equals("c1"))
        {
            try {
                k3 = (Circle) k1.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported");
            }
        }
        else{
            try {
                k3 = (Circle) k2.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported");
            }
        }
        if(k3.getRadius() == k1.getRadius()){
            System.out.print("C1\n");
        }
        else System.out.print("C2\n");
        /*System.out.p2rintln("radius k1 : " + k1.radius);
        System.out.println("radius k2 : " + k2.radius);
        System.out.println("radius k3 : " + k3.radius);*/
       
        System.out.println("Circle 1 Area : "+k1.getArea());
        System.out.println("Circle 2 Area : "+k2.getArea());
        System.out.println("Circle 3 Area : "+k3.getArea());
        System.out.println("Find the larger of 2 instance of comparable object : ");
        System.out.print("Circle 1 compare to Circle 2 : "+moreTh(c2.compareTo(c1)));

    }
    else if(choice ==2){
        //Rectangle 
        Rectangle rec1 = new Rectangle(5,2);
        Rectangle rec2 = new Rectangle(8,7);
        Rectangle rec3 = new Rectangle();

        try {
            rec3 = (Rectangle) tellMaxRec(rec1,rec2).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
        
        System.out.println("\nRec 1 Area : "+rec1.getArea());
        System.out.println("Rec 2 Area : "+rec2.getArea());
        System.out.println("Rec 3 Area : "+rec3.getArea());
        //moreTh(c2.compareTo(c1))
        ComparableRect r1 = new ComparableRect(rec1.width, rec1.height); // 30
        ComparableRect r2 = new ComparableRect(rec2.width, rec2.height); // 56
        System.out.print("\nCloing Rectangle c3 by using : ");
        if(rec3.height == rec1.height  && rec3.width == rec1.width){
            System.out.print("Rec 1\n");
        }
        else System.out.print("Rec 2\n");
        //System.out.print("Find the larger of 2 instance of comparable object : ");
        
        System.out.print("Rect 1 compare to Rect 2 : "+moreTh(r2.compareTo(r1)));
        
        
    }
    //Triangle
    else if(choice ==3){
    
        Triangle t1 = new Triangle(15,2,"white",500);
        Triangle t2 = new Triangle(8,2,"black",100);
        Triangle t3 = new Triangle();
        System.out.print("\nFind the larger object using max method : ");
        ComparableTri tr1 = new ComparableTri(t1.getHeight(),t1.getBase());
        ComparableTri tr2 = new ComparableTri(t2.getHeight(),t2.getBase());
        System.out.println("\nAnswer : "+moreThPrint(tr2.compareTo(tr1)));

       try {
            t3 = (Triangle) tellMaxTri(t1,t2).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
        System.out.print("\nCloing Triangle t3 by using : ");
        String name3 = input.nextLine();
        if(name3.equals("t1"))
        {
            try {
                t3 = (Triangle) t1.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported");
            }
        }
        else{
            try {
                t3 = (Triangle) t2.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported");
            }
        }
        if(t3.getHeight() == t1.getHeight()){
            System.out.print("T1\n");
        }
        else System.out.print("T2\n");
        /*System.out.p2rintln("radius k1 : " + k1.radius);
        System.out.println("radius k2 : " + k2.radius);
        System.out.println("radius k3 : " + k3.radius);*/
       
        System.out.println("Tri 1 Area : "+t1.getArea());
        System.out.println("Tri 2 Area : "+t2.getArea());
        System.out.println("Tri 3 Area : "+t3.getArea());
        System.out.println("Find the larger of 2 instance of comparable object : ");
        System.out.print("Triangle 1 compare to Triangle 2 : "+moreTh(tr2.compareTo(tr1)));

    }
    //Exit
    else System.exit(0);
    }
    


    public static String moreTh(int a){
        if(a==1)
            return "Shape 1 > Shape 2";
        else if (a==-1)
            return "Shape 1 < Shape 2";
        else 
            return "Shape 1 == Shape 2";
    }



    public static String moreThPrint(int a){
        if(a==1)
            return "Shape 1";
        else if (a==-1)
            return "Shape 2";
        else 
            return "Shape 1 == Shape 2";
    }
    public static Circle tellMax (Circle a, Circle b){
        if (a.getRadius() > b.getRadius())
        return a;
        else if(a.getRadius() < b.getRadius())
        return b;
        else return a;
    }
    
    public static Rectangle tellMaxRec (Rectangle a, Rectangle b){
        if (a.getArea() > b.getArea())
        return a;
        else if(a.getArea() < b.getArea())
        return b;
        else return a;

    }
    public static Triangle tellMaxTri (Triangle a, Triangle b){
        if (a.getArea() > b.getArea())
        return a;
        else if(a.getArea() < b.getArea())
        return b;
        else return a;

    }
}