package OPPsConcept; 
public class Student {

String fn;
String ln;
int age;
public Student() {
	fn = "";
	ln = "";
	age = 0;
}
public Student(String firstName, String lastName, int newAge) {
	fn = firstName;
	ln = lastName;
	age = newAge;
}

}