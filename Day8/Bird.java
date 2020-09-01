
public abstract class Bird {
	
	public static void main(String[] args) {
		int length;
		int weight;
		int breadth;
		String colour;
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
