public class IsocelesTriangle extends Triangle implements Printable{
    
    private int baseLength;
    private int sideLength;
    private int height;    

    public IsocelesTriangle(String name, int numSides, int baseLength, int sideLength, int height){
        super(name, numSides, baseLength, sideLength, sideLength, height);
        this.baseLength = baseLength;
        this.sideLength = sideLength;
        this.height = height;    
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Number of Sides: %d%n Base: %d%n Side 1: %d%n Side 2: %d%n Height: %d%n Area: %f%n",
        name, numSides, baseLength, sideLength, sideLength, height, super.getArea(baseLength, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}