package encapsulation_abstrcation;
//overriding,inheritence
class fruit{
	String name,taste,size;
	fruit(String n,String t,String s){
		name=n;
		taste=t;
		size=s;
	}
	void eat() {
		System.out.println(name+" "+taste);
	}
}
class apple extends fruit{
	apple(String n,String t,String s){
		super(n,t,s);
	}
	//override
	void eat() {
		System.out.println(name+" "+taste);
	}
}
class orange extends fruit{
	orange(String n,String t,String s){
		super(n,t,s);
	}
	//override
	void eat() {
		System.out.println(name+" "+taste);
	}
}

public class fruitcheck {
public static void main(String[] args) {
	apple a=new apple("Apple","sweet","heart");
	orange o=new orange("Orange","sour","round");
			a.eat();
			o.eat();
}
}
