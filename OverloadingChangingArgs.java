package Today22Feb;
public class OverloadingChangingArgs{
	static int sum(int a,int b) {
		return a+b;
	}
	static int sum (int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5,6));
		System.out.println(OverloadingChangingArgs.sum(5,6,7));
	}
}