package rectangle;

public class Rectangle {
	private int a;
	private int b;
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Rectangle(int a) {
		this.a = a;
		this.b = a;
	}
	
	public int getArea() {
		return this.a * this.b;
	}
	
	public String getInfo() {
		return this.a+", "+this.b+": "+getArea();
	}
	
	public void setRectangleSides(int a, int b) {
		this.a = a;
		this.b  = b;
	}
	
	public void setSquareSides(int a) {
		this.a = a;
		this.b  = a;
	}
	
	public boolean thisLargerArea(Rectangle x) {
		if(x.getArea() < this.getArea())
			return true;
		else
			return false;
	}
	
	public boolean equalsSides(Rectangle x) {
		if(x.a == this.a) {
			
			if(x.b == this.b) 
				return true;
			
		} else if(x.a == this.b)
			
			if(x.b == this.a)
				return true;
			
		return false;
		
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
}
