package abstraction;

public class Contractor extends Employee {
	
		
	@Override
	public void calculateSalary() {
		
		int workinghour= 5;
		System.out.println("Salary Calculated by Contractor: "+(super.Salaryperhour*workinghour));
		// TODO Auto-generated method stub
		
	}
	
}
