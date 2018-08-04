//Shape Interface
abstract class Shape {
	abstract void draw();
}

//Class Poloygon extends Shape
public class Polygon extends Shape {
	public void draw() {
		System.out.println("This is polygon class");
	}
}

//Class Triangle extends Shape
public class Triangle extends Shape {
	public void draw() {
		System.out.println("This is triangle class");
	}
}

//Main Class for calling sub classes
public class ShapeTest {
	public static void main(String args[]) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Polygon();
		shape[2] = new Circle();
		for(int i=0;i<3;i++) {
			shape[i].draw();
		}
		
	}
}
