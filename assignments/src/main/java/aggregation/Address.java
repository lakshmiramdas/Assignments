package aggregation;

public class Address {
	String Address;
	Student ref;
	public Address(String Address,Student ref)
	{	this.Address=Address;
		this.ref=ref;
	}
	public void Display()
	{
		System.out.println("Name: "+ref.name+"\n"+"Roll Num:"+ref.rollnum);
		System.out.println("Address: "+Address);
	}

	public static void main(String[] args) {
		Student obj=new Student("Denwar",23);
		Address obj1=new Address("Delhi,India",obj);
		obj1.Display();
		// TODO Auto-generated method stub

	}

}
