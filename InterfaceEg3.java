package Today28Feb;
interface Person{
	void Speak();
}
class Student implements Person{
	@Override
	public void Speak() {
		System.out.println("I'm a Student");
	}	
}
class Teacher implements Person{
	@Override
	public void Speak() {
		System.out.println("I'm a Teacher");	
	}
}
public class InterfaceEg3 {
public static void main(String[] args) {
	Student obj = new Student();
	obj.Speak();
	Teacher obj1 = new Teacher();
	obj1.Speak();
	
	
}
}
