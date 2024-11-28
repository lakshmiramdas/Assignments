package assingConsandMeth;

public class FindArea {
	
	public void area(int radius, float pi)
	{
		 float area = pi * radius * radius;
	     System.out.println("Area of circle is :" + area);
	}
	public void area(int width,int height)
	{
		int area=width*height;
		 System.out.println("Area of rectangle is :" + area);
	}
	public void area(int s)
	{
		 int a=s*s; 
		 System.out.println("Area of square is :" + a);
	}
	public static void main(String[] args) {
		FindArea obj=new FindArea();
		obj.area(5,3.14f);
		obj.area(5,10);
		obj.area(15);
		// TODO Auto-generated method stub

	}

}
