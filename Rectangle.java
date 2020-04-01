
public class Rectangle extends Shape 
{
	public Rectangle()
	{
		this("NoName");
	}
	
	public Rectangle(String name)
	{
		this(name, 2);
	}
	
	public Rectangle(String name, int length)
	{
		this(name, length, 2 * length);
	}
	
	public Rectangle(String name, int length, int width)
	{
		this(name, length, width, new Point("corner", 0,0));
	}

	public Rectangle(String name, int length, int width, Point corner)
	{
		super(name);
		mLength = length;
		mWidth = width;
		mCorner = new Point(corner);
	}
	
	public Rectangle(Rectangle r)
	{
		this("Copy of " + r.getName(), r.getLength(), r.getWidth(), new Point(r.getCorner()));
	}
	
	@Override
	public double getArea() 
	{
		return mLength * mWidth;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * mLength + 2 * mWidth;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Rectangle)) throw new InvalidDistanceComputationException("Rectangle", other.getClass().toString());
		else
		{
			Rectangle r = (Rectangle)other;
			return mCorner.getDistance(r.mCorner);
		}
	}
	
	@Override
	public String toString()
	{
		return "Rectangle: " + super.toString() + ", Corner: " + mCorner + ", Length: " + mLength + ", Width: " + mWidth;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Rectangle)) throw new InvalidComparisonException("Rectangle", other.getClass().toString());
		else
		{
			Rectangle r = (Rectangle)other;
			return mCorner == r.mCorner && mLength == r.mLength && mWidth == r.mWidth;
			
		}
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Rectangle)) 
		{
			return 1; //greatest
		}
		else
		{
			Rectangle r = (Rectangle)arg0;
			
			int answer = mCorner.compareTo(r.mCorner);
			if(answer != 0) return answer;
			else
			{
				double areaDiff = getArea() - r.getArea();
				if(areaDiff < 0) return -1;
				else if(areaDiff == 0) return 0;
				else return 1;
			}
				
		}
	}
	
	@Override
	public String scale(int scaleFactor)
	//TODO: still doing "Point: Name = Copy of: corner" need to remove "copy of"
	{
		mLength = mLength * scaleFactor;
		mWidth = mWidth * scaleFactor;
		Rectangle r = new Rectangle(getName(), mLength, mWidth);
		return r.toString();
	}
	
	public Point getCorner()
	{
		return mCorner;
	}
	
	public int getLength()
	{
		return mLength;
	}
	
	public int getWidth()
	{
		return mWidth;
	}
	
	private Point mCorner;
	private int mLength;
	private int mWidth;
	

}
