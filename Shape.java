abstract class Shape{
    
    private String name;
    private int numSides; 
    private double area;

    //Base constructor
    public Shape(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
    }

    //Abstract method(s) - different for all subclasses
    abstract public double getArea();

    //Implemented method(s) - same for all subclasses
    public void changeName(String name){
        this.name = name;
    }
}