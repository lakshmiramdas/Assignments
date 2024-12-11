package superKeyWord;

public class Class2 extends Class1{
	
	public void result()
	{
		int result=super.add(20,40);
		if(result%10==0)
		{
			System.out.println("The Addition result is divisible by 10");
		}
		else
		{
			System.out.println("Not divisible");
		}
	}

	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.result();
		// TODO Auto-generated method stub

	}

}
