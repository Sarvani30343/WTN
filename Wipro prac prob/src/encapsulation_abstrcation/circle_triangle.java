package encapsulation_abstrcation;
//polymorphism
class shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void erase() {
		System.out.println("erasing shape");
	}
}
class circle extends shape{
	//override
	void draw() {
		System.out.println("drawing circle"); 
	}
	void erase() {
		System.out.println("erasing circle");
	}
}
class triangle extends shape{
	//override
	void draw() {
		System.out.println("drawing triangle"); 
	}
	void erase() {
		System.out.println("erasing triangle");
	}
}
class square extends shape{
	//override
	void draw() {
		System.out.println("drawing square"); 
	}
	void erase() {
		System.out.println("erasing square");
	}
}
public class circle_triangle {
public static void main(String[] args) {
	shape c=new circle();
	shape t=new triangle();
	shape s=new square();
	c.draw();
	c.erase();
	t.draw();
	t.erase();
	s.draw();
	s.erase();
}
}
