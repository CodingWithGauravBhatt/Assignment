package Class;
class Java{
	Java(){
		System.out.println("Welcome to Java Classes");
	}
}
class JavaStudents extends Java{
	JavaStudents(){
	super();
	System.out.println("Hi, Everyone I'm a New Student");
	}
}

public class SuperEg2 {
	public static void main(String[] args) {
		JavaStudents obj = new JavaStudents();
	
	}
}
