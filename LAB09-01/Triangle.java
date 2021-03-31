public class Triangle implements Cloneable{
    double height;
    double base;
    String color;
    double weight;
    public Triangle() {
       
    }
    
    
     /**
     * @param radius
     * @param color
     * @param weight
     */
    public Triangle(double height,double base, String color, double weight) {
        this.height = height;
        this.base = base;
        this.color = color;
        this.weight = weight;
    }
        
    public double getArea(){
        return height*base/2.0;
    }
   
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    //clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
