public class Circle {
    private double _radius;
    public double Pi = 3.14;
    public void setRadius(double radius){
        _radius=radius;
    }
    public double getRadius(){
        return _radius;
    }
    public double getCircleArea(){
        return Pi*(_radius*_radius);
    }
    public double getCircleLength(){
        return 2*Pi*(_radius);
    }

}
