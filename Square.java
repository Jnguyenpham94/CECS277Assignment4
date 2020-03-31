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
	public String scale(int scalefactor) {
		// TODO Auto-generated method stub
		return null;
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
		double recOne = getArea();
		double rectwo = r.getArea();
		// TODO Equality for rectangles is defined by their areas being equal.
		return 0;
	}

	private Rectangle mSquare;
	private String mName;
	private int mSide;
}
