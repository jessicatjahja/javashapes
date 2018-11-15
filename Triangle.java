public class Triangle extends Shape implements Printable{

    protected int baseLength;
    protected int side1Length;
    protected int side2Length;
    protected int height;
    
    protected Triangle(String name, int numSides, int baseLength, int height){
        super(name, numSides);
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    protected double getArea(int baseLength, int height){
        double area = (0.5 * baseLength * height);
        return area;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Base: %d%n Side 1: %d%n Side 2: %d%n Height: %d%n",
        name, baseLength, side1Length, side2Length, height);
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
}