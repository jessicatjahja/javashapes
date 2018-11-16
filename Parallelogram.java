public class Parallelogram extends Rectangle implements Printable{
    
    private int baseLength;
    private int sideLength;
    private int height;    

    public Parallelogram(String name, int numSides, int baseLength, int sideLength, int height){
        super(name, numSides, baseLength, sideLength);
        this.height = height;        
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Base: %d%n Side: %d%n Height: %d%n Area: %d%n",
        name, baseLength, sideLength, height, super.getArea(baseLength, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}