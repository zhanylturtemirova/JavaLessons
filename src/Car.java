public class Car {
    private String _brand;
    private String _model;
    private int _year;

    public void setBrand(String brand){
        _brand=brand;
    }
    public void setModel(String model){
        _model = model;
    }
    public void setYear(int year){
        _year = year;
    }
    public String getBrand(){
        return _brand;
    }
    public String getModel(){
        return _model;
    }
    public int getYear(){
        return _year;
    }

    public void displayInfo(){
        System.out.println("Brand: "+_brand);
        System.out.println("Model: "+_model);
        System.out.println("Year: "+_year);

    }
}
