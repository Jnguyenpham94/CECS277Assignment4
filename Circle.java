
public class Circle extends Shape 
{
	public Circle()
	{
		this(new Name());
	}
	
	public Circle(String name)
	{
		this(new Name(name));
	}
	
	public Circle(Name name)
	{
		this(name, new Point());
	}
	
	
	public Circle(Name name, Point center)
	{
		this(name, center, 1.0);
	}
	
	public Circle(Name name, Point center, double radius)
	{
		super(name);
		mCenter = center;
		mRadius = radius;
		
	}
	
	public Circle(Circle c)
	{
		this(new Name("Copy of " + c.getName()), new Point(c.getCenter()), c.getRadius());
	}
	
	@Override
	public double getArea() 
	{
		return PI * mRadius * mRadius;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * PI * mRadius;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Circle)) return 0.0;
		else
		{
			Circle c = (Circle)other;
			return mCenter.getDistance(c.mCenter);
		}
	}
	
	@Override
	public String toString()
	{
		return "Circle: " + super.toString() + ", Center: " + mCenter + ", Radius: " + mRadius;
	}
	
	@Override 
	public boolean equals(Object other)
	{
		if(!(other instanceof Circle)) 
		{
			throw new InvalidComparisonException("Circle", other.getClass().toString());
		}
		else
		{
			Circle c = (Circle)other;
			return super.equals(c) && mCenter.equals(c.mCenter) && mRadius == c.mRadius;
		}
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Circle)) 
		{
			if(arg0 instanceof Point) return 1; // Circle > Point
			else return 0; // Should throw error
		}
		else
		{
			Circle c = (Circle)arg0;
			
			int answer = mCenter.compareTo(c.mCenter);
			if(answer != 0) return answer;
			
			if(mRadius < c.mRadius) return -1;
			else if(mRadius == c.mRadius)return 0;
			else return 1;
		}
	}
	
	@Override
	public String scale(int scaleFactor)
	{
		double radius = mRadius * scaleFactor;
		Circle c = new Circle(new Name(getName()), mCenter, radius);
		
		return c.toString();
	}
	public Point getCenter()
	{
		return mCenter;
	}
	
	public double getRadius()
	{
		return mRadius;
	}
	
	private Point mCenter;
	private double mRadius;
	
	private static final double PI = 3.14159;

}
