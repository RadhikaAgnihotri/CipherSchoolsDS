package primitiveDT;
class Parent{
	void fun()//overridden method
	{
		System.out.println("Hi I'm A");
	}
	int temp =10;
}
class Child extends Parent{
	int temp=5;
	void parentFun(){
		super.fun();
		System.out.println("Parents temp is: "+ super.temp);
	}
	void fun()//overriding method
	{
		System.out.println("Hi I'm B");
		System.out.println("Temp is: "+temp);
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.fun();
		c.parentFun();
	}

}
