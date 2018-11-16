public class EquilateralTriangle extends Triangle implements Printable{
    
    private String name;
    private int sideLength;
    private int height;
    private double area = getArea(this.sideLength, this.height);

    public EquilateralTriangle(String name, int numSides, int sideLength, int height){
        super(name, numSides, sideLength, sideLength, sideLength, height);        
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Base: %d%n Side 1: %d%n Side 2: %d%n Height: %d%n Area: %d%n",
        name, baseLength, sideLength, sideLength, height, area);
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}