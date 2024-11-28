package assingConsandMeth;

public class FindAverage {
	public void average(int t, int e,int d)
	   {	int num1=t;
			int num2=e;
			int num3=d;
		    int Avg=(num1+num2+num3)/3;
			System.out.println("Average of Integervalues: "+Avg);
		}
		public void average(float r, float d,float f)
		{	float num1=r;
			float num2=d;
			float num3=f;
			float Avg=(num1+num2+num3)/3;
			System.out.println("Average of Floatnumbers: "+Avg);
		}

	public static void main(String[] args) {
		FindAverage obj=new FindAverage();
		obj.average(4,6,9);
		obj.average(4.6f,3.2f,9.8f);
		// TODO Auto-generated method stub

	}

}
