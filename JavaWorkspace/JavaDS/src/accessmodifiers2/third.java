package accessmodifiers2;
import accessmodifiers.first;
public class third extends first{// subclass of firsts
	void fun(){
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f = new first();
//		System.out.println(f.a); //private field
//		System.out.println(f.b); //default or package private
		System.out.println(f.c);
		System.out.println(f.d);
	}

}
