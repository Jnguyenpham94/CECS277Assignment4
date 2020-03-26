

public class Square extends Rectangle{

	private Rectangle mSquare;

	public Square() {
		mSquare = new Rectangle();
		this.mName = "NoNameSquare";
		this.mSide = 3;
	}
	
	public double getArea(){
		return mSquare.getArea();
	}

	public double getDistance(Shape s1) {
		return mSquare.getDistance(s1);
	}

	public String getName(){
		return mName;
	}

	private int getSide() {
		return mSide;
	}

	@Override
	public String toString()
	{
		return "Square: " + getName() + ", Side: " + getSide();
	}

	private String mName;
	private int mSide;
}
