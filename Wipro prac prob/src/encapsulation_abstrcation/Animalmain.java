package encapsulation_abstrcation;
//inheritence1
class Animal {
  
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");
}
}
class Bird  extends Animal {
//override

public void sleep() {
    System.out.println("method sleep...overided");
}
public void eats() {
    System.out.println("method eats...overrided");
}
public void fly() {
	System.out.println("fly method");
}
}

public class Animalmain {
	public static void main(String[] args) {
	    
	    Animal animal = new Animal();
	    Bird bird = new Bird();
	  animal.sleep();
	  animal.eats();
	  bird.sleep();
	  bird.eats();
	  bird.fly();
	}

}
