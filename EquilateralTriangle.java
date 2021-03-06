public class EquilateralTriangle extends Triangle implements Printable{
    
    private int sideLength;
    private int height;    

    public EquilateralTriangle(String name, int numSides, int sideLength, int height){            
        super(name, numSides, sideLength, sideLength, sideLength, height);
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Number of Sides: %d%n Base: %d%n Side 1: %d%n Side 2: %d%n Height: %d%n Area: %f%n",
        name, numSides, baseLength, sideLength, sideLength, height, super.getArea(sideLength, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}