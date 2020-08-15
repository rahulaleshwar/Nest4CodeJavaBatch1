import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
	
	//inputs
	Scanner foot = new Scanner(System.in);
        System.out.println("enter foot:");
        int a = foot.nextInt();
        Scanner inch = new Scanner(System.in);
        System.out.println("enter inch:");
        int b = inch.nextInt();
        Scanner weight = new Scanner(System.in);
        System.out.println("enter weight:");
        int c = weight.nextInt();
	
	//calling_methods
	Convetrors detail = new Convetrors();
	detail.heightConverotr(a, b);
	detail.weightConvertor(c);
	}

}

class Convetrors{
//method_for_height	
public static float heightConverotr(int heightFeetPart, int heightInchPart) {
	 double ftoi,itocm,iptocm;
	 float convertedtocm;
	 ftoi = heightFeetPart * 12;
	 itocm = ftoi * 2.54;
	 iptocm = heightInchPart * 2.54;
	 convertedtocm = (float) (itocm + iptocm);
	 System.out.println("Height in cm : " +convertedtocm);
	 return convertedtocm;
}
//method_for_weight
public static float weightConvertor(float weight){
	double ptokg;
	ptokg = weight * 2.2;
	 System.out.println("Weight in pounds : " +ptokg);
	 return (float) ptokg;
}
}