package Shape;

class Rectangle extends Shape {
	Rectangle(double width, double height){
		this.area = width * height;
		this.perimeter = 2 * (height + width);
		this.name = "Rectangle";
	}

}
