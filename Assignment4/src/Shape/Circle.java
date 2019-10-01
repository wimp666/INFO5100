package Shape;

class Circle extends Shape {
	Circle(double radius) {
		this.area = 3.14 * radius * radius;
		this.perimeter = 2 * 3.14 * radius;
		this.name = "Circle";
	}
}
