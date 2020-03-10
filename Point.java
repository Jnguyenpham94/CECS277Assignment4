
public class Point extends Shape
{
	public Point()
	{
		this("No name", 0,0);
	}
	
	public Point(String name, Point p)
	{
		this(name, p.mX, p.mY);
	}
	
	public Point(Point p)
	{
		this("Copy of: " + p.getName(), p.getX(), p.getY());
	}
	
	public Point(String name, int x, int y)
	{
		super(name);
		mX = x;
		mY = y;
	}
	
	@Override
	public double getArea()
	{
		return 0.0;
	}
	
	@Override
	public double getPerimeter()
	{
		return 0.0;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Point)) return 0.0;
		else
		{
			Point p = (Point)other;
			return Math.sqrt(	((mX - p.mX) * (mX - p.mX)) +
								((mY - p.mY) * (mY - p.mY)) );
		}
	}
	
	public int getX()
	{
		return mX;
	}
	
	public int getY()
	{
		return mY;
	}
	
	@Override
	public String toString()
	{
		return "Point: " + super.toString() + ", (" + mX + "," + mY + ")";
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Point)) return false;
		else
		{
			Point p = (Point)other;
			return super.equals(p) && mX == p.mX && mY == p.mY;
		}
	}
		
	@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Point))
		{
			return -1; // Point is least
		}
		else
		{
			Point p = (Point)arg0;
			
			if(mX < p.mX) return -1;
			else if(mX > p.mX) return 1;
			else
			{
				if(mY < p.mY) return -1;
				else if(mY > p.mY) return 1;
				else return 0;
			}
		}
	}
	
	@Override
	public String scale(int scaleFactor)
	{
		int x = mX + scaleFactor;
		int y = mY + scaleFactor;
		Point p = new Point(getName(), x, y);
		
		return p.toString();
	}
	
	private int mX;
	private int mY;
	
	
}
