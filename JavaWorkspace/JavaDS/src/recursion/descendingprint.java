package recursion;

public class descendingprint {
	static void fun(int n)
	{
		if(n<0) return;
//		System.out.println(n); //A
		fun(n-1);//B
		System.out.println(n); //A
		
		//or 
		
//		if(n>=0)
//			{
//			System.out.println(n); //A
//			fun(n-1);//B
//			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}

}
