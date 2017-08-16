/*
 * Brendan Howell
 * CSC-151
 * Test program to test Rectangle class
 * 
 */
public class TesterRectangle {

	public static void main(String[] args) {
		//  Create instance of Rectangle class
		Rectangle rect = new Rectangle(10.0, 5.0);
		
		//rect.setLength(10.0);
		//System.out.println(rect.getLength());
		
		//rect.setWidth(5.0);
		//System.out.println(rect.getWidth());
		
		double area = rect.calcArea();
		System.out.println("Area is " + area);
		
		
		// create another instance of Rectangle
		Rectangle kitchen = new Rectangle(50.0, 20.0);
		
		//kitchen.setLength(50.0);
		//System.out.println(kitchen.getLength());
		
		//kitchen.setWidth(20.0);
		//System.out.println(kitchen.getWidth());
		
		double areaKitchen = kitchen.calcArea();
		System.out.println("The kitchen's area is " + areaKitchen);
		
	}  //  End Main

}  //  End Class
