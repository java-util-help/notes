public class MaximumField {
	public double y1; // non-static Field or instance variable
	public double y2; 
	public static double y3; // static Field
	
	public static void main(String[] args) {
		MaximumField object1 = new MaximumField();
		MaximumField object2 = new MaximumField();
		
		y3 = 9.5;
		object1.print();
		object2.print();
	}	

	public /* static */ void print() {
		System.out.println("The value of static variable y3 is "+ y3);
	}
}