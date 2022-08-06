package _07_duck;

public class Runner {
	
	public static void main(String[] args) {
		
		Duck Daffy = new Duck("donuts", 5);
		Turtle Bob = new Turtle("sharks", 1000);
		Daffy.quack();
		Daffy.waddle();
		Bob.dive();
		Bob.goAshore();
		
	}
	
}
