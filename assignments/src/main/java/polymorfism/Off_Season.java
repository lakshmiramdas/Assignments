package polymorfism;

public class Off_Season {
	public void discount(int a, int b, int c)
	{
		int t=a+b+c;
		int d=(t*15)/100;
		int totalPrice=t-d;
		System.out.println("Total Price: "+t);
		System.out.println("Off-Season Discount: "+d);
		System.out.println("Final price after Discount: "+totalPrice);
	}

}
