package Lab;

public class Answer1 {
		public static void main(String[] args) {
			String a = "(101+0)/3 ->";
			String b = "(3.0e-6*10000000.1) ->";
			String c = "true && true ->";
			String f = "(false || false)&&(true && true) ->";
			String d= "false && true ->";
			String e = "(false && false)||(true && true) ->";

			
			System.out.println(a +" " + (101+0)/3);
			System.out.println(b +" "+ 3.0e-6*10000000.1);
			System.out.println(c +" "+ true);
			System.out.println(d +" "+ false);
			System.out.println(e +" "+ true);
			System.out.println(f +" "+ false);
					
		}
		}

