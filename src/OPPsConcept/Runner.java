package OPPsConcept;

public class Runner {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.fn = "jack";
		st1.age = 21;
		
		st2.fn = "micha";
		st3.fn = "joe";
		
		Student st4 = new Student("Michael", "Jackson", 150);
		
		
		System.out.println(st1.fn + " age is " + st1.age );
		
		System.out.println(st4.fn);
	}
}