package design.build;

public class ViewMain {

	public static void main(String args[]) {
		
		Person p = new Person.Builder().name("xing").age(22).isBoy(true).score(99).build();
		
		System.out.println("---------------" + p.getName());
	}
}
