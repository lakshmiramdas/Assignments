package inheritance;

public class SalaryClass2 extends salaryClass1 {
	
	public  SalaryClass2(int basicpay, int deduction, int bonus)
	{
		super(basicpay,deduction,bonus);
		
	}
	int hra;
	int pf;
	public int CalculateHra()
{   
	 hra=(super.basicpay*5)/100;
		return hra;
}
public int CalculatePf()
{
	 pf=(super.basicpay*20)/100;
	return pf;
}

public void Display1()
{	CalculateHra();
   System.out.println("HRA is: "+hra);
    CalculatePf();
	System.out.println("PF is: "+pf);
}


}
