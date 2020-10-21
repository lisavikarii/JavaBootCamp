/**
 * 
 */
package sef.module6.activity;

/**
 * @author Max
 *
 */
public class AbstractionActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle(5, "red");
		
		System.out.println("Circle area is: " + circle.calculateArea());
		System.out.println("Circle perimeter is: " + circle.calculatePerimeter());
		
		Rectangle rect = new Rectangle(5,6, "blue");
		
		System.out.println("Rectangle area is: " + rect.calculateArea());
		System.out.println("Rectangle perimeter is: " + rect.calculatePerimeter());
		
	}

}
