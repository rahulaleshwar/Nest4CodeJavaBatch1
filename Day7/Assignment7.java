/* 1.Create the Bird Abstract Class with 4 properties and 2 non-abstract methods and 2 abstract methods
2.Create Three subclasses Parrot, Ostrich, Penguin and implement abstract methods
3.Create Two interfaces FlyBehaviour, SwimBehaviour
4.Parrot class will extend Bird and implements FlyBehavior
5.Penguin class will extend Bird and implements SwimBehavior
*/

public abstract class Assignment7 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		int length;
		int weight;
		int breadth;
		String colour;
		System.out.println("Ostrich:");
		Ostrich OstrichObj = new Ostrich();
		OstrichObj.fly();
		OstrichObj.sound();
		System.out.println("---------------------");
		System.out.println("Parrot:");
		Parrot ParrotObj = new Parrot();
		ParrotObj.fly();
		ParrotObj.sound();
		System.out.println("---------------------");
		System.out.println("Penguin:");
		Penguin PenguinObj = new Penguin();
		PenguinObj.swim();
		PenguinObj.sound();

	}

	public void eat() {
		System.out.println("eating");

	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public abstract void fly();

	public abstract void sound();
}
