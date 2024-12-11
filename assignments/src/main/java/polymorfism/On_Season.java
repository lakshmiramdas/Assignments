package polymorfism;

public class On_Season extends Off_Season {
	public void discount(int a, int b, int c)
	{	super.discount(600,750,1000);
		int t=a+b+c;
		int dis=(t*20)/100;
		int totalPrice=t-dis;
		System.out.println("Total Price: "+t);
		System.out.println("On-Season Discount: "+dis);
		System.out.println("Final price after Discount: "+totalPrice);
	}

	public static void main(String[] args) {
		On_Season obj=new On_Season();
		obj.discount(1000, 2000, 3500);
		// TODO Auto-generated method stub

	}

}
