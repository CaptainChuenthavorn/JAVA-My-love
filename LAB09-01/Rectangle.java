public class Rectangle implements Cloneable {
    double width;
    double height;
    public Rectangle(){

    }
    public Rectangle(double w,double h){
        width = w;
        height = h;
    }
    public double getArea(){
        return width*height;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
