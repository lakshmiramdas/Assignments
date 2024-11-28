package String;

public class palindrome {
	
	public void Find(String str)
	{	String rev="";
		int length = str.length();
		 
	     for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	     if (str.equalsIgnoreCase(rev)) {
	         System.out.println(str+" is a palindrome");}
	      else {
	         System.out.println(str+" is not a palindrome");}
	}

	public static void main(String[] args) {
		palindrome obj=new palindrome();
		obj.Find("java");
		obj.Find("Malayalam");
		
		// TODO Auto-generated method stub

	}

}
