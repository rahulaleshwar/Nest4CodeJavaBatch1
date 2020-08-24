public class Main {
	public static void main(String[] args) {
		
        Switcher switcher1=new Switcher(5,10,250,"Havells","India");
        switcher1.display();
        System.out.println("------------------------------------------");
        Switcher switcher2=new Switcher(2,50,100,"Bajaj","Italy");
        switcher2.display();
        System.out.println("------------------------------------------");
        Switcher switcher3=new Switcher(2,50,100,"Bharat Electronics","USA");
        switcher3.display();
        System.out.println("------------------------------------------");
        Switcher switcher4=new Switcher(3,50,100,"Philips","Brazil");
        switcher4.display();
        System.out.println("------------------------------------------");
        Switcher switcher5=new Switcher(5,50,100,"Exide","Europe");
        switcher5.display();
    }

}
