package primitiveDT;
class Parents
{
	void printParentHashCode(){
		System.out.println(this.hashCode());
	}
}
class Childs extends Parents{
	void printChildHashCode(){
		System.out.println(this.hashCode());
	}
	void printParentfromChild(){
		super.printParentHashCode();
		//If same output - Parent class object not created.
		//If diff output - Parent class object created.
	}
}
public class objCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs c = new Childs();
		c.printChildHashCode();
		c.printParentHashCode();
		c.printParentfromChild();
	}

}
