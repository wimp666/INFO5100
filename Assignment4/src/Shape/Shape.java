package Shape;

public class Shape {
	String name;
	Double perimeter;
	Double area;
	
	Shape() {
		name = "Shape";
	}
	
	 void draw() {
		 System.out.println("Drawing " + this.name);
	 }
	 void getArea() {
		 System.out.println(this.area);
	 }
	 void getPerimeter() {
		 System.out.println(this.perimeter);
	 }

}
