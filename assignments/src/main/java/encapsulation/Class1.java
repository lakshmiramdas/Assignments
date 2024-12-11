package encapsulation;

public class Class1 {
	private int pin;
	public void SetPin(int pin)
	{	this.pin=pin;
		
	}
	public void ValidatePin()
	{
		if(pin==1001)
		{
		System.out.println("The given Pin is Valid");
		}
		else if(pin==1234)
		{
			System.out.println("The given Pin is Valid");	
		}
		else if(pin==1212)
		{
			System.out.println("The given Pin is Valid");	
		}
		else
		{
			System.out.println("The pin is NOT Valid");	
		}
		}

}
