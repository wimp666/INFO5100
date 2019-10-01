package Shape;

class Square extends Shape {
	Square(double side){
		this.area = side * side;
		this.perimeter = side * 4;
		this.name = "Square";
	}
}
