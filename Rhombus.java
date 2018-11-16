public class Rhombus extends Rectangle implements Printable{
    
    private int side;
    private int height;    

    public Rhombus(String name, int numSides, int side, int height){
        super(name, numSides, side, side);
        this.side = side;
        this.height = height;        
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Sides: %d%n Height: %d%n Area: %f%n",
        name, side, height, super.getArea(side, height));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}