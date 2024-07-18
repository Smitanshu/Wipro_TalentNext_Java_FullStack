package oopExer;

class Shape {

	void draw() {
		System.out.println("Drawing Shape ");

	}

	void erase() {
		System.out.println("Erasing Shape  ");
	}

}

class Circle extends Shape {

	void draw() {
		System.out.println("Drawing Circle ");

	}

	void erase() {
		System.out.println("Erasing  Circle");
	}

}

class Triangle extends Shape {

	void draw() {
		System.out.println("Drawing Triangle ");

	}

	void erase() {
		System.out.println("Erasing  Triangle ");
	}

}

class Square extends Shape {

	void draw() {
		System.out.println("Drawing   Square");

	}

	void erase() {
		System.out.println("Erasing Square");
	}

}

public class Polymorphism {

	public static void main(String[] args) {

		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();

		System.out.println("In circle class-----: ");
		c.draw();
		c.erase();
		System.out.println("In Triangle class----:");
		t.draw();
		t.erase();
		System.out.println("In Square class----:");
		s.draw();
		s.erase();

	}

}
