abstract class Shape 

{
   
   String color;
   boolean filled;
   
   
public Shape() {
		super();
	}


	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract double getArea();
	abstract double getPerimeter();


	@Override
	public String toString() {
		return  " " + color + " " + filled;
	}

}




class Circle extends Shape{
	
	double radius;
	

	public Circle() {
		super();
		
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled,double radius) {
		super(color, filled);
		this.radius = radius;

	}
	

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	double getPerimeter() {
		
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}
	
	

}





class Rectangle extends Shape{

	double length,width;
	
	
	
	
	public Rectangle() {
		super();
		
	}

	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width,String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
		
	}
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	double getArea() {
	
		return length * width;
	}

	@Override
	double getPerimeter() {

		return 2 * (length + width);
	}


	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", filled=" + filled + ", length=" + length + ", width=" + width + "]";
	}
	
	

}







class Square extends Rectangle 
{
	
	
	public Square() {
		super();
		
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	
	}

	public Square(double side) {
		super(side,side);
		
	}
	public void setLength(double side) {
		super.length = side;
	}
	public void setWidth(double side) {
		super.width = side;
	}

	public double getSide() {
		return super.length;
	}

	public void setSide(double side) {
		super.length = side;
	}

	@Override
	double getArea() {
		return super.length * super.width;
	}

	@Override
	double getPerimeter() {
		
		return 4 * super.length;
	}

	@Override
	public String toString() {
		return "Square [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled + "]";
	}
	
}


public class MainShape
{
public static void main(String args[])
{


Circle c=new Circle("Blue",true,15.0);
Rectangle r=new Rectangle(100,100);


Square sq=new Square(10.1,"Green",true);


System.out.println(c.toString());
System.out.println(r.toString());
System.out.println(sq.toString());
}
}
