import java.util.*;

public class ShapeTest{    
    public static void main(String[] args) {
        
        ArrayList<Printable> shapes = new ArrayList<Printable>();

        Triangle triangle = new Triangle("Triangle", 3, 3, 4, 5, 3);
        EquilateralTriangle eqTriangle = new EquilateralTriangle("Equilateral Triangle", 3, 7, 4);
        IsocelesTriangle isoTriangle = new IsocelesTriangle("Isoceles Triangle", 3, 8, 9, 7);

        Rectangle rectangle = new Rectangle("Rectangle", 4, 10, 8);
        Square square = new Square("Square",4, 5);
        Parallelogram parallelogram = new Parallelogram("Parallelogram", 4, 12, 7, 8);
        Rhombus rhombus = new Rhombus("Rhombus", 4, 13, 9);

        shapes.add(triangle);
        shapes.add(eqTriangle);
        shapes.add(isoTriangle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(parallelogram);
        shapes.add(rhombus);

        for(Printable shape : shapes){
            shape.print();
        }
    }
}