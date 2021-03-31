class ComparableTri extends Triangle implements Comparable<Triangle> {

    public ComparableTri(double height,double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public int compareTo(Triangle o) {
        if (o.getArea() > super.getArea()) {
            
            return 1;
        } else if (o.getArea() < super.getArea()) {
           
            return -1;
        } else {
            
            return 0;
        }
    }
    
}