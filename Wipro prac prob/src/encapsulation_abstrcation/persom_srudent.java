package encapsulation_abstrcation;
//inheritence2

class Person
{
	private String name;
	private int birthYear;

	public Person(String n, int byear)
	{
	  name = n;
	  birthYear = byear;
	}

	public String toString()
	{
	  return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}

public class persom_srudent {
	public static void main(String[] args)
	  {
	    Person a = new Person("Anil", 1992);
	    Employee b = new Employee("Jimmy", 1919, "Information Technology");
	   // Instructor c = new Instructor("Mike", 1998, 95000);
	    System.out.println(a);
	    System.out.println(b);
	    //System.out.println(c);
	  }
}
class Employee extends Person
{
  private String major;

  public Employee(String n, int byear, String m)
  {
     super(n, byear);
     major = m;
  }

  public String toString()
  {
    return "Student[super=" + super.toString() + ",major=" + major + "]";
  }
}