class ComparableRect extends Rectangle implements Comparable<Rectangle>{
    
    public ComparableRect(double w , double h)
    {
        width = w;
        height = h;
    }
    @Override
    public int compareTo(Rectangle o) {
        if(o.getArea() > super.getArea()) { return 1;}
        else if(o.getArea() < super.getArea()) { return -1;}
        else {return 0;}   
    }

}