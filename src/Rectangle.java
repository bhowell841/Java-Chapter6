/*
 * Brendan Howell
 * CSC-151
 * Writing a class (with no main method)
 */
public class Rectangle {

	// declare instance variables
	private double length;
	private double width;
	
	// constructor
	public Rectangle(double len, double wid){
		length = len;
		width = wid;
	}  // End constructor
	
	public void setLength(double len){
		length = len;
	}  //  End setLength
	
	public double getLength(){
		return length;
	}  // End getLength
	
	public void setWidth(double wid){
		width = wid;
	}  //  End setWidth
	
	public double getWidth(){
		return width;
	}  // End getWidth
	
	public double calcArea(){
		return length*width;
	}  //  End calcArea
	
}  //  End Class
