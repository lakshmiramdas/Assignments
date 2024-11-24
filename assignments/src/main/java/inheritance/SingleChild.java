package inheritance;

public class SingleChild extends SingleParent {
	public void content()
	{	String a="i10";
		String b="BMW";
		String c="Honda";
		System.out.println(a+"\n"+b+"\n"+c+"\n");
	}

	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.details();
		obj.content();
		
		// TODO Auto-generated method stub

	}

}
