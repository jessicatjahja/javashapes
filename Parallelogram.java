public class Parallelogram extends Rectangle implements Printable{
    
    private int baseLength;
    private int sideLength;
    private int height;    

    public Parallelogram(String name, int numSides, int baseLength, int sideLength, int height){
        super(name, numSides, baseLength, sideLength);
        this.baseLength = baseLength;
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Number of Sides: %d%n Base: %d%n Sides: %d%n Height: %d%n Area: %f%n",
        name, numSides, baseLength, sideLength, height, super.getArea(baseLength, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}