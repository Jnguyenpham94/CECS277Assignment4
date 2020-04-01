//Assignment 4
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class Square extends Shape{

	public Square() {
		super("NoNameSquare");
		mSquare = new Rectangle("NoNameSquare");
		mSide = 3;
	}
	
	public double getArea(){
		return mSquare.getArea();
	}

	public double getDistance(Shape s1) {
		return mSquare.getDistance(s1);
	}

	private int getSide() {
		return mSide;
	}

	@Override
	public String toString()
	{
		return "Square: " + super.getName() + ", Side: " + getSide();
	}

	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Square))
		{
			throw new InvalidComparisonException("Square", o.getClass().toString());
		}
		else
		{
			Square s = (Square)o;			
			return super.equals(s);
		}
	}

	@Override
	public String scale(int scalefactor) {
		mSide *= scalefactor;
		Square s = new Square();
		return s.toString();
	}

	@Override
	public double getPerimeter() {
		return mSquare.getPerimeter();
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Object))
		{
			return 1;
		}
		Rectangle r = (Rectangle) o;
		Double recOne = new Double(getArea());
		Double rectwo = new Double(r.getArea());
		// TODO Equality for rectangles is defined by their areas being equal.
		return recOne.compareTo(rectwo);
	}

	private Rectangle mSquare;
	private int mSide;
}
