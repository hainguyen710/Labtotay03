package labTotayEx3;

public class RunRectangle {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
			rectangle.setHeight(3);
			rectangle.setWidth(5);
			
			rectangle.display();
			System.out.println(rectangle.getArea(0));
			
			System.out.println(rectangle.getPerimeter(0));
	}
	

}
