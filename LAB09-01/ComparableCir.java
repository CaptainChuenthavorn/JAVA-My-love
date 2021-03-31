class ComparableCir extends Circle implements Comparable<Circle> {

    public ComparableCir(double r) {
        radius = r;
    }

    @Override
    public int compareTo(Circle o) {
        if (o.getArea() > super.getArea()) {
            
            return 1;
        } else if (o.getArea() < super.getArea()) {
           
            return -1;
        } else {
            
            return 0;
        }
    }
    
}