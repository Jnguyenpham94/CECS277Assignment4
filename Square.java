//Assignment 4
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class Square extends Shape{

	public Square() {
		super("NoNameSquare");
		mSquare = new Rectangle();
		mSide = 3;
	}

	private int getSide() {
		return mSide;
	}

	public double getArea() {
		return mSide * mSide;
	}

	@Override
	public double getPerimeter() {
		return mSquare.getPerimeter();
	}

	@Override
	public double getDistance(Shape s1) {
		if(!(s1 instanceof Square))
		{
			throw new InvalidDistanceComputationException("Square", s1.getClass().toString());
		}
		else
		{
			Square r1 = (Square)s1;
			return mSquare.compareTo(r1.mSquare);
		}
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
	public int compareTo(Object o) {
		return mSquare.compareTo(o);
	}
  
private Rectangle mSquare;
private int mSide;  
}
