package abstraction;

public class FullTimeEmployee extends Employee {
	
	public void calculateSalary()
	{
		int workinghour= 8;
		System.out.println("Salary Calculated by FulltimeEmployee: "+(super.Salaryperhour*workinghour));
	}

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj.CalculateSalary();
		obj.calculateSalary();
		obj1.calculateSalary();
		// TODO Auto-generated method stub

	}

}
