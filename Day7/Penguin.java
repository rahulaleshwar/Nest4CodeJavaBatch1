public class Penguin extends Bird implements Swimbehaviour {
	public void sound() {
		System.out.println("Penguin is honking");
	}

	public void swim() {
		System.out.println("Penguin can swim");
	}

	@Override
	public void fly() {

	}

}