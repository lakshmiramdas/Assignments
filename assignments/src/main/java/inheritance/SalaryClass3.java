package inheritance;

public class SalaryClass3 extends SalaryClass2{
	 int tota;
	public 	SalaryClass3(int basicpay, int deduction, int bonus)
	{	super(basicpay,deduction,bonus);
	
	}
	 public int Cal()
	 {	
		int total=basicpay+super.CalculateHra()-super.CalculatePf()-deduction+bonus;
		System.out.println("BasicPay: "+basicpay);
		System.out.println("Deduction: "+deduction);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		 System.out.println("Total Salary by hand: "+total);
		return total;
		
	 }

	public static void main(String[] args) {
		SalaryClass3 obj=new SalaryClass3(1000,100,500);
		obj.Cal();
		// TODO Auto-generated method stub

	}

}
