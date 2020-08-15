import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    System.out.println("TAX CALCULATOR");

    //price 1
    Scanner fobj = new Scanner(System.in);
    System.out.println("price 1");
    float price_1 = fobj.nextFloat();

    //price 2
    Scanner sobj = new Scanner(System.in);
    System.out.println("price 2");
    float price_2 = sobj.nextFloat();

    //price_3
    Scanner tobj = new Scanner(System.in);
    System.out.println("price 3");
    float price_3 = tobj.nextFloat();

    //tax%
    Scanner taxobj = new Scanner(System.in);
    System.out.println("tax in %");
    float taxper = taxobj.nextFloat();

    //total price
    float totalamount = price_1+price_2+price_3;

    //tax
    float tax = taxper / 100 * totalamount;

    //final amount
    float finalamount = totalamount + tax;
    System.out.println("Final amount:" +finalamount);
  }
}