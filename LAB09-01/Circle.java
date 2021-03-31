
public class Circle implements Cloneable {
    double radius;
    String color;
    double weight;
    public Circle() {
       
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
     /**
     * @param radius
     * @param color
     * @param weight
     */
    public Circle(double radius, String color, double weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }
        
    public double getArea(){
        return Math.PI*radius*radius;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    //clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

   
}
