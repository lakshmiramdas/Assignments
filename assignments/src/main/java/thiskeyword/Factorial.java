package thiskeyword;

public class Factorial {
	int number;
	int result=1;
	public void factorialcal(int number)
	{	this.number=number;
	
	for(int i=1;i<=number;i++)
	{
		result=result*i;
	}
	}
	public void display() {
		this.factorialcal(5);
		System.out.println("Factorial of given number: "+result);
		
		}
	public static void main(String[] args) {
		Factorial obj=new Factorial();
		obj.display();		
			// TODO Auto-generated method stub

	}

}
