package thiskeyword;

public class Constuctor {
	int number;
	int reverse=0;
	public Constuctor(int number)
	{
		this.number=number;
		while(number!=0)
		{ int revnum=number%10;
		  reverse=reverse*10+revnum;
		  number=number/10;
		}
	}
	
	public Constuctor()
	{
		this(12345);
		System.out.println("Original number: "+number);
		System.out.println("Reversed number: "+reverse);
	}
	

	public static void main(String[] args) {
		Constuctor obj=new Constuctor();
		// TODO Auto-generated method stub

	}

}
