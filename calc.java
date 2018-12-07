
public class calc {
		//Integers, whole numbers.
	public int add(int a, int b) {
	return a + b;	
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public int multi(int a, int b) {
		return a * b;
	}
	
	//Decimals
	
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double div(double a, double b) {
		return a / b;
	}
	public double multi(double a, double b) {
		return a * b; 
	}
	//floats, cutting down big numbers
	//public float fmulti(double d, double e) {
		//return (float) (d * e);
	//}
	
	
	public static void main (String[]args) {
		calc myCalculator = new calc();
		System.out.println(myCalculator.add(2,2));
		System.out.println(myCalculator.sub(3,1));
		System.out.println(myCalculator.multi(2,2));
		System.out.println(myCalculator.div(2,2));
		System.out.println(myCalculator.multi(2.2, 2.2));
	}
}
