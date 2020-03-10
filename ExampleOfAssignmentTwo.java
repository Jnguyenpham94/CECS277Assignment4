import java.util.ArrayList;
import java.util.Collections;


public class ExampleOfAssignmentTwo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point("p2", 5,5);
		Point p3 = new Point(p1);
		
		Name n1 = new Name("c1");
		Name n2 = new Name("c2");
		Name n3 = new Name("c3");
		Circle c0 = new Circle();
		Circle c1 = new Circle(n1, p2);
		Circle c2 = new Circle(n2);
		Circle c3 = new Circle(n3, p2, 5);
		Circle c4 = new Circle(c3);
		c3.setName("Changed");
		n1.setName("X");
		
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(p2);
		shapes.add(p3);
		shapes.add(c0);
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(c3);
		shapes.add(c4);
		
		for(Shape s : shapes)
		{
			sop("\n" + s);
			sop("Name: " + s.getName());
			sop("Area: " + s.getArea());
			sop("Perimeter: " + s.getPerimeter());
		}
		
		sop("\np1 == p3?: " + p1.equals(p3));
		sop("c3 == c4?: " + c3.equals(c4));
		
		// Use Comparable Interface
		sop("\nShapes unsorted: ");
		for(Shape s : shapes) sop(s + "");
		
		sop("\nShapes sorted: ");
		Collections.sort(shapes);
		for(Shape s : shapes) sop(s + "");
		
		// Use Scalable Interface
		doScale(p1, 2);
		doScale(c1, 6);
	}

	static private void doScale(Scalable s, int scale)
	{
		sop("");
		sop("Original: " + s);
		sop("Scale by " + scale + ": " + s.scale(scale));
	}
	
	static private void sop(String s)
	{
		System.out.println(s);
	}
}
