public class Square extends Rectangle implements Printable{
    
    private int side;    

    public Square(String name, int numSides, int side){
        super(name, numSides, side, side);
        this.side = side;
    }

    @Override
	public String toString() {
        return String.format("Shape: %s%n Width: %d%n Height: %d%n Area: %f%n",
        name, side, side, super.getArea(side, side));
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}