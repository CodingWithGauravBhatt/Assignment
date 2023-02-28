package Today28Feb;
abstract class Shape1{
	abstract void show();
	void CalculateArea() {
		System.out.println("Non abstract method");
	}
}
class Circle1 extends Shape1{

	@Override
	void show() {
		System.out.println("It's a Circle Class");
		
	}
}
class Rectangle extends Shape1{
	@Override
	void show() {
		System.out.println("It's a Rectangle Class");		
	}	
}
public class AbstractEg {
public static void main(String[] args) {
	Circle1 obj = new Circle1();
	Rectangle obj1 = new Rectangle();
	obj.show();
	obj1.show();
}
}