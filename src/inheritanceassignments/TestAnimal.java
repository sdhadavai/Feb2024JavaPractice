package inheritanceassignments;

public class TestAnimal {

	public static void main(String[] args) {
		
		//Using Grand child class object -->we can access child, parent and grand parent data members
		
		System.out.println("---------------Using Grand Child class Dog object-------------------------");
		Dog d = new Dog();
		System.out.println("----Accessing child class data members----------");
		d.bark();
		System.out.println(d.breed);
		System.out.println("----Accessing Parent class data members----------");
		d.giveBirth();
		System.out.println(d.furColor);
		System.out.println("----Accessing Grand Parent class data members----------");
		d.eat();
		d.sleap();
		System.out.println(d.age);
		System.out.println(d.species);
		
		System.out.println("---------------Using Grand Child class Eagle object-------------------------");
		Eagle e = new Eagle();
		System.out.println("----Accessing child class data members----------");
		e.hunt();
		System.out.println(e.setLocation);
		System.out.println("----Accessing Parent class data members----------");
		e.fly();
		System.out.println(e.wingSpan);
		System.out.println("----Accessing Grand Parent class data members----------");
		e.eat();
		e.sleap();
		System.out.println(e.age);
		System.out.println(e.species);
		
		System.out.println("---------------Using Grand Child class Snake object-------------------------");
		Snake s = new Snake();
		System.out.println("----Accessing child class data members----------");
		s.strike();
		System.out.println(s.venomous);
		System.out.println("----Accessing Parent class data members----------");
		s.crawl();
		System.out.println(s.scalePattern);
		System.out.println("----Accessing Grand Parent class data members----------");
		s.eat();
		s.sleap();
		System.out.println(s.age);
		System.out.println(s.species);
		
		//By using Child class object --> We can access child and parent class members but not grand child class objects
		System.out.println();
		
		System.out.println("********************************************************************************");
		System.out.println("---------------Using Child class Mammal object-------------------------");
		Mammal m = new Mammal();
		System.out.println("Accessing Child Mammal class members");
		System.out.println(m.furColor);
		m.giveBirth();
		System.out.println("Accessing Parent Animal class members");
		System.out.println(m.age);
		System.out.println(m.species);
		m.eat();
		m.sleap();
		
		System.out.println("---------------Using Child class Bird object-------------------------");
		Bird b = new Bird();
		System.out.println("Accessing Child Mammal class members");
		System.out.println(b.wingSpan);
		b.fly();
		System.out.println("Accessing Parent Animal class members");
		System.out.println(b.age);
		System.out.println(b.species);
		b.eat();
		b.sleap();
		
		System.out.println("---------------Using Child class Reptile object-------------------------");
		Reptile r = new Reptile();
		System.out.println("Accessing Child Mammal class members");
		System.out.println(r.scalePattern);
		r.crawl();
		System.out.println("Accessing Parent Animal class members");
		System.out.println(r.age);
		System.out.println(r.species);
		r.eat();
		r.sleap();
		
		//By using Parent (Grand Parent we can access only that class data members and it's parent if any
		System.out.println("********************************************************************************");
		System.out.println("---------------Using Parent class Aniamal object-------------------------");
		Animal a = new Animal();
		System.out.println(a.age);
		System.out.println(a.species);
		a.eat();
		a.sleap();
		
		//Grand child object to Parent class reference

		System.out.println("********************************************************************************");
		System.out.println("---------------Using Parent class Mammal reference poiting to Dog object-------------------------");
		//We cannot access Dog class individual methods and do not have overridden methods to access
		//We can access Mammal class methods as reference is Mammal class and its Parent Animal class members
		Mammal md = new Dog();
		System.out.println(md.furColor);
		md.giveBirth();
		System.out.println(md.age);
		System.out.println(md.species);
		md.eat();
		md.sleap();
		
		System.out.println("********************************************************************************");
		System.out.println("---------------Using Parent class Bird reference poiting to Eagle object-------------------------");
		//We cannot access Eagle class individual methods and do not have overridden methods to access
		//We can access Bird class methods as reference is Bird class and its Parent Animal class members
		Bird be = new Eagle ();
		System.out.println(be.wingSpan);
		be.fly();;
		System.out.println(be.age);
		System.out.println(be.species);
		be.eat();
		be.sleap();
		
		System.out.println("********************************************************************************");
		System.out.println("---------------Using Parent class Reptile reference poiting to Snake object-------------------------");
		//We cannot access Snake class individual methods and do not have overridden methods to access
		//We can access Reptile class methods as reference is Reptile class and its Parent Animal class members
		Reptile rs = new Snake ();
		System.out.println(rs.scalePattern);
		rs.crawl();
		System.out.println(rs.age);
		System.out.println(rs.species);
		rs.eat();
		rs.sleap();
		

	}

}
