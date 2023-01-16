package my.day17.f.block;

public class Main_block {

	public static void main(String[] args) {
		
		Child child1 = new Child();
		System.out.println("child1.name =>" + child1.name);
		System.out.println("child1.name =>" + Child.count);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Child child2 = new Child();
		child2.name = "전지현";
		System.out.println("child1.name =>" + child2.name);
		System.out.println("child1.name =>" + Child.count);
	}
}
