package _07_duck;

public class Turtle {
	
	int numberOfEggs;
	String worstPredator;
	void dive() {
		System.out.println("Dive");
	}
	void goAshore() {
		System.out.println("Gone Ashore");
	}
	Turtle(String worstPredator, int numberOfEggs) {
      	this.worstPredator = worstPredator;
      	this.numberOfEggs = numberOfEggs;
	}
	
}
