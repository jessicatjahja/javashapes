public class Triangle extends Shape implements Printable{

    protected int baseLength;
    protected int side1Length;
    protected int side2Length;
    protected int height;
           
    public Triangle(String name, int numSides, int baseLength, int side1Length, int side2Length, int height){
        super(name, numSides);
        this.baseLength = baseLength;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.height = height;
    }

    public double getArea(int baseLength, int height){
        return (0.5 * baseLength * height);
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Number of Sides: %d%n Base: %d%n Side 1: %d%n Side 2: %d%n Height: %d%n Area: %f%n",
        name, numSides, baseLength, side1Length, side2Length, height, getArea(baseLength, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());		
	}
}