package assingConsandMeth;

public class StudentGrade {
	String n;
	int a;
	int b;
	int c;
	public StudentGrade(String n,int a, int b, int c)
	{	this.n=n;
		this.a=a;
		this.b=b;
		this.c=b;
		}
	public int StudentGradecal()
	{  int total=a+b+c;
	  	//System.out.println("Total marks: "+total);
		return total;	
	}
	public void StudentGrading(int t)
	{ 
	int p=(t*100)/300;
	if (p>=90)
	{ 
	System.out.println("Grade A");
	}
	else if (p>=80)
	{ 
	System.out.println("Grade B");
	}
	else if (p>=70)
	{ 
	System.out.println("Grade c");
	}
	else  
	{
	System.out.println("Fail");
	}
	}
	public static void main(String[] args) {
		
		StudentGrade obj=new StudentGrade("Aaryan",70,80,95);
		int x=obj.StudentGradecal();
		System.out.println("total marks of x: "+x);
		obj.StudentGrading(x);
		StudentGrade obj1=new StudentGrade("Lakshmi",60,55,34);
		int y=obj1.StudentGradecal();
		System.out.println("total marks of y: "+y);
		obj1.StudentGrading(y);
				
			// TODO Auto-generated method stub

	}

}
