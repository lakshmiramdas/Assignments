package interfaceAssingment;

public class HDFC implements RBI{
	
	@Override
	public double RecurringDeposit(double CustomerDeposit,double TimePeriod) 
	{
		double TotalDeposit =CustomerDeposit*TimePeriod;
		System.out.println();
		double SI = (CustomerDeposit * TimePeriod * (TimePeriod + 1) / 2) * (interestrate / (12 * 100));
		System.out.println(SI);
		double Maturity= TotalDeposit + SI;
		return Maturity;
				
		// TODO Auto-generated method stub
		
	}
	public static void main(String Args[])
	{	HDFC obj=new HDFC();
		double x=obj.RecurringDeposit(10000,2);
		System.out.println("RecurringDeposit which can accept the amount and duration: "+x);
	}
	
	
}
