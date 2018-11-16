public class Rectangle extends Shape implements Printable{

    protected int width;
    protected int height;
        
    public Rectangle(String name, int numSides, int width, int height){
        super(name, numSides);
        this.width = width;
        this.height = height;
    }

    public double getArea(int width, int height){
        return width * height;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Width: %d%n Height: %d%n Area: %f%n",
        name, width, height, getArea(width, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());		
	}
}