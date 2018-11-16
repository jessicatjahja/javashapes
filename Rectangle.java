public class Rectangle extends Shape implements Printable{

    protected int width;
    protected int height;
    protected double area = getArea(this.width, this.height);
    
    public Rectangle(String name, int numSides, int width, int height){
        super(name, numSides);
        this.width = width;
        this.height = height;
    }

    public double getArea(int width, int height){
        double area = (width * height);
        return area;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Width: %d%n Height: %d%n Area: %d%n",
        name, width, height, area);
	}

	@Override
	public void print() {
		System.out.println(this.toString());		
	}
}