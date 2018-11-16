public abstract class Shape{
    
    public String name;
    public int numSides; 
    public double area;

    //Base constructor
    public Shape(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
    }

    //Abstract method(s) - different for all subclasses
    abstract public double getArea(int side1, int side2);

    //Implemented method(s) - same for all subclasses
    public void changeName(String name){
        this.name = name;
    }
}