package rectangle;

public class Main {
	public static void main(String args[]) {
		Rectangle a = new Rectangle(5, 3);
		Rectangle b = new Rectangle(10, 8);
		Rectangle c = a;
		
		System.out.println("a: "+a.getInfo()+"\nb: "+b.getInfo()+"\nc: "+c.getInfo());
		
		a.setSquareSides(6);
		System.out.println("\na: "+a.getInfo()+"\nb: "+b.getInfo()+"\nc: "+c.getInfo());
		
		a.setRectangleSides(b.getA(), b.getB());
		System.out.println("(a == b): "+(a == b));
		System.out.println("(a == c): "+(a == c));
		System.out.println("a.equalsSides(b): "+a.equalsSides(b));
	}
	
}
